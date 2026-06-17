package com.example.demo.domain.service;

import java.util.ArrayList;
import java.util.List;

import org.seasar.doma.jdbc.SelectOptions;
import org.springframework.stereotype.Service;

import com.example.demo.domain.dao.EmployeeDao;
import com.example.demo.domain.dto.EmployeeDto;
import com.example.demo.domain.dto.EmployeePageDto;
import com.example.demo.domain.entity.Employee;

@Service
public class EmployeeListServiceImpl implements EmployeeListService {

    private static final int PAGE_SIZE = 5;

    private EmployeeDao employeeDao;

    public EmployeeListServiceImpl(EmployeeDao employeeDao) {
        this.employeeDao = employeeDao;
    }

    @Override
    public EmployeePageDto listEmployeeDto(int page) {
        int offset = (page - 1) * PAGE_SIZE;
        SelectOptions options = SelectOptions.get().offset(offset).limit(PAGE_SIZE).count();
        List<Employee> employeeList = employeeDao.selectAll(options);

        List<EmployeeDto> employeeDtoList = new ArrayList<>();
        for (Employee employee : employeeList) {
            EmployeeDto employeeDto = new EmployeeDto();
            employeeDto.setEmployeeId(employee.getEmployeeId());
            employeeDto.setEmployeeName(employee.getEmployeeName());
            employeeDto.setDepartmentName(employee.getDepartmentName());
            employeeDto.setExtensionNumber(employee.getExtensionNumber());
            employeeDtoList.add(employeeDto);
        }

        long totalCount = options.getCount();
        int totalPages = (int) Math.ceil((double) totalCount / PAGE_SIZE);

        EmployeePageDto employeePageDto = new EmployeePageDto();
        employeePageDto.setEmployeeDtoList(employeeDtoList);
        employeePageDto.setTotalCount(totalCount);
        employeePageDto.setTotalPages(totalPages);

        return employeePageDto;
    }
}
