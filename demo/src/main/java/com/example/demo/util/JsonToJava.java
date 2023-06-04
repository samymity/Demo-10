package com.example.demo.util;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.annotation.*;

public class JsonToJava {

    @JsonProperty("message_a")
    private String messagea;

    public String getMessage() {
        return messagea;
    }

    public void setMessage(String messagea) {
        this.messagea = messagea;
    }

    public static void main(String[] args) {
        String json = "{\"message_a\": \"Hello, World!\"}";

        try {
            ObjectMapper objectMapper = new ObjectMapper();
            JsonToJava JsonToJava = objectMapper.readValue(json, JsonToJava.class);
            System.out.println(JsonToJava.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
