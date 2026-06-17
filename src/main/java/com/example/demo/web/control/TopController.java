package com.example.demo.web.control;

import java.time.LocalDate;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TopController {
	@GetMapping("/")
	public String index() {
		return "index";
	}
	
	@GetMapping("/employees/search")
	public String search() {
		return "input-search";
	}
	
	// 航空券検索入力画面を表示
    @GetMapping("/tickets/input")
    public String showInputTicket(Model model) {
    	LocalDate today = LocalDate.now();
        LocalDate maxDate = today.plusMonths(3);

        model.addAttribute("minDate", today);
        model.addAttribute("maxDate", maxDate);
        return "input-ticket";
    }

}
