package org.exercise.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;

@Controller
public class HomeController {

    @GetMapping("/Home")
    public String home() {
        return "HomePage.html"; // Returns the name of the template file (without .html)
    }

    @GetMapping("/Global")
    public String global() {
        return "Global.html"; // Returns the name of the template file (without .html)
    }
}