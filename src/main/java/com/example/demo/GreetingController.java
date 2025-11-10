package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @GetMapping("/students")
    public String showStudents(Model model) {
        List<String> students = List.of("Alice", "Bob", "Charlie", "David");
        model.addAttribute("students", students);
        return "students"; // templates/students.html
    }
    //http://localhost:8080/students

    @GetMapping("/studentList")
    public String showStudentList(Model model) {
        List<Student> students = List.of(
                new Student("Alice", 20),
                new Student("Bob", 21),
                new Student("Charlie", 22),
                new Student("David", 19)
        );

        model.addAttribute("students", students);
        return "studentList";
    }
    //http://localhost:8080/studentList


    // process form and submit
    @PostMapping("/greet")
    public String handleForm(@RequestParam("username") String username, Model model) {
        model.addAttribute("username", username);
        return "result";
    }
}
