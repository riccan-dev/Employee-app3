package com.example.demo.domain.service;

import com.example.demo.domain.dto.EmployeePageDto;

public interface EmployeeListService {
    EmployeePageDto listEmployeeDto(int page);
}
