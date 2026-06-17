package com.example.demo.domain.dto;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EmployeePageDto {
    private List<EmployeeDto> employeeDtoList;
    private long totalCount;
    private int totalPages;
}
