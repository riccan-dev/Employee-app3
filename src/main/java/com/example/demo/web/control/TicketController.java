package com.example.demo.web.control;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TicketController {

    // 入力された日付と都市を受け取って結果画面へ
    @GetMapping("/tickets/result")
    public String showResultTicket(
            @RequestParam("date") String date,
            @RequestParam("city") String city,
            Model model) {

        model.addAttribute("date", date);
        model.addAttribute("city", city);

        return "result-ticket";
    }

}
