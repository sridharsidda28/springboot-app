package com.example.springboot_app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "Hello from Jenkins + SonarQube + Docker!";
    }

    @GetMapping("/health")
    public String health() {
        return "Application is healthy";
    }
}