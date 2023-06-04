package com.example.demo.util;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.json.JsonMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

public class JsonToXml {
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public static void main(String[] args) {
        String json = "{\"message\": \"Hello, World!\"}";

        try {
            ObjectMapper jsonMapper = new JsonMapper();
            ObjectMapper xmlMapper = new XmlMapper();
            JsonToXml helloWorld = jsonMapper.readValue(json, JsonToXml.class);
            String xml = xmlMapper.writer().with(SerializationFeature.INDENT_OUTPUT).writeValueAsString(helloWorld);
            System.out.println(xml);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}