package com.example.demo.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class HelloWorldConsumer {
	 
	
	
	@GetMapping("/Weather1")
	    public String test() {
		 
       // SpringApplication.run(HelloWorldConsumer.class, args);
        RestTemplate restTemplate = new RestTemplate();
        String url = "http://localhost:8091/hello";
        String response = restTemplate.getForObject(url, String.class);
        System.out.println(response);
        return response ;
    }
}