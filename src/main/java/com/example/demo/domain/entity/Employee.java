package com.example.demo.domain.entity;

import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Metamodel;
import org.seasar.doma.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(metamodel = @Metamodel)
@Table(name = "employees")
@Getter
@Setter
@NoArgsConstructor
public class Employee {
	
	@Id
	@Column(name = "employee_id")
	private Integer employeeId;
	
	@Column(name = "employee_name")
    private String employeeName;

	@Column(name = "department_name")
    private String departmentName;

	@Column(name = "extension_number")
    private String extensionNumber;
}
