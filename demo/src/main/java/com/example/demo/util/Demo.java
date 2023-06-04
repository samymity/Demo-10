package com.example.demo.util;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

// Person class
class Person {
   @JsonIgnore
   @JsonProperty("name")    
   String name;  
   
   @JsonProperty("age")    
   int age;       
   
   Person() {}
  
   Person(String name, int age) {
       this.name = name;  
       this.age = age;       
   }
}

public class Demo {
   public static void main(String[] args) throws JsonProcessingException {

       ObjectMapper mapper = new ObjectMapper();  
      
       // Create a Person object       
       Person person = new Person("John", 30);  
       
       String json = mapper.writeValueAsString(person);
       System.out.println(json); 
       
       // Prints {"name":"John","age":30}  
      
		
       String personJson = "{\"name\":\"Jane\",\"age\":28}";
		 
		  Person personFromJson =mapper.readValue(personJson, Person.class);
		  
		  System.out.println(personFromJson.name);
		  System.out.println(personFromJson.age);
		 
   }
}