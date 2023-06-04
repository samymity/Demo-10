package com.example.demo;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.util.Piece;

@SpringBootApplication
@RestController
public class DemoApplication {


	@Autowired
	public Piece piece;
	
	@Value("${my.property}")
	public String myproperty ;
	
	
	
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}


	
	
	
	@GetMapping("/hello")
	    public String hello() {
		
		
	        return myproperty;
	    }
	
	 @GetMapping("/b")
	    public Map<String, String> helloWorld() {
	        Map<String, String> response = new HashMap<>();
	        response.put("message", "Hello World!");
	        return response; }
	
}
