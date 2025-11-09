package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class GreetingController {
    // display form
    @GetMapping("/form")
    public String showForm() {
        return "form";
    }

    // process form and submit
    @PostMapping("/greet")
    public String handleForm(@RequestParam("username") String username, Model model) {
        model.addAttribute("username", username);
        return "result";
    }
}
