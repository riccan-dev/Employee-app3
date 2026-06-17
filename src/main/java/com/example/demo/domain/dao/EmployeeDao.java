package com.example.demo.domain.dao;

import java.util.List;

import org.seasar.doma.Dao;
import org.seasar.doma.Select;
import org.seasar.doma.boot.ConfigAutowireable;
import org.seasar.doma.jdbc.SelectOptions;

import com.example.demo.domain.entity.Employee;

@Dao
@ConfigAutowireable
public interface EmployeeDao {

	@Select
	Employee selectById(Integer employeeId);

	@Select
	List<Employee> selectAll(SelectOptions options);
}
