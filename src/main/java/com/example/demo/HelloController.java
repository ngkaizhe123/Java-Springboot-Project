package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String home() {
        return "Welcome to Spring Boot!";
    }

    @GetMapping("/hello")
    public String hello() {
        return "Hello, this is your first Spring Boot API!";
    }
}
