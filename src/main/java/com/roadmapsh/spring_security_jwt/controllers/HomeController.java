package com.roadmapsh.spring_security_jwt.controllers;

import lombok.Data;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Data
@RestController
@RequestMapping("/hello")
public class HomeController {
    @GetMapping
    public String hello() {
        return "Hello World!";
    }
}
