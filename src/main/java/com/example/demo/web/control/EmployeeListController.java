package com.example.demo.web.control;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.domain.dto.EmployeeDto;
import com.example.demo.domain.service.EmployeeListService;

@Controller
public class EmployeeListController {
	private EmployeeListService employeeListService;

	public EmployeeListController(EmployeeListService employeeListService) {
		this.employeeListService = employeeListService;
	}

	@GetMapping("/employeesList")
	public String list(@RequestParam(defaultValue = "1") int page, Model model) {
		
		int totalPages;
		List<EmployeeDto> employeeDtoList = employeeListService.listEmployeeDto(page);
		totalPages = employeeListService.getTotalPages();
		model.addAttribute("employeeDtoList", employeeDtoList);
		model.addAttribute("currentPage", page);
		model.addAttribute("totalPages", totalPages);

		model.addAttribute("employeeDtoList", employeeDtoList);
		
		model.addAttribute("pageList", buildPageList(page, totalPages));
		return "employee-list";
	}
	
	private List<Integer> buildPageList(int currentPage, int totalPages) {
	    List<Integer> list = new ArrayList<>();
	    for (int i = 1; i <= totalPages; i++) {
	        if (i == 1 || i == totalPages || (i >= currentPage - 1 && i <= currentPage + 1)) {
	            list.add(i);
	        } else if (!list.isEmpty() && list.get(list.size() - 1) != null) {
	            list.add(null); // "..." を表す
	        }
	    }
	    return list;
	}

}
