package com.example.demo.web.control;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.web.form.EmployeeIdForm;

@Controller
public class SearchController {
	@GetMapping("/search")
	public String inputSearch(Model model) {
		model.addAttribute("employeeIdForm", new EmployeeIdForm());
		return "input-search";
	}

}
