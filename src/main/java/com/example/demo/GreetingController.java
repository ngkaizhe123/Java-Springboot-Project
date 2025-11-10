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

    @GetMapping("/info")
    public String showInfo(Model model) {
        model.addAttribute("name", "Andrew");
        model.addAttribute("age", 20);
        model.addAttribute("country", "Malaysia");
        return "info"; // templates/info.html
    }


    // process form and submit
    @PostMapping("/greet")
    public String handleForm(@RequestParam("username") String username, Model model) {
        model.addAttribute("username", username);
        return "result";
    }
}
