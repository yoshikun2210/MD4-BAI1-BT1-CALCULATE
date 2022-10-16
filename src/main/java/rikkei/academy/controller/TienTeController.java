package rikkei.academy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TienTeController {
    @PostMapping ("/calculate")
    public String TienTe(@RequestParam float usd, @RequestParam float rate, Model model) {
        float result = usd * rate;
        model.addAttribute("result", result);
        return "result";
    }
}
