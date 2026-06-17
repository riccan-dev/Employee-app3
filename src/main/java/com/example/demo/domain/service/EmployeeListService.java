package com.example.demo.domain.service;

import java.util.List;

import com.example.demo.domain.dto.EmployeeDto;

public interface EmployeeListService {
	
	public List<EmployeeDto> listEmployeeDto(int page);
	public int getTotalPages();
}
