package com.example.demo.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    
    @GetMapping("/a")
    public Map<String, String> helloWorld() {
        Map<String, String> response = new HashMap<>();
        response.put("message", "Hello World!");
        return response;
    }
    
}