package com.example.demo.util;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.util.StdDateFormat;

import java.io.IOException;
import java.text.ParseException;
import java.util.Date;

public class JsonToJavaCustom {
    @JsonProperty("JsonToJavaCustom_name")
    private String JsonToJavaCustomName;

    @JsonProperty("JsonToJavaCustom_date")
    @JsonDeserialize(using = CustomDateDeserializer.class)
    private Date JsonToJavaCustomDate;

    public String getJsonToJavaCustomName() {
        return JsonToJavaCustomName;
    }

    public void setJsonToJavaCustomName(String JsonToJavaCustomName) {
        this.JsonToJavaCustomName = JsonToJavaCustomName;
    }

    public Date getJsonToJavaCustomDate() {
        return JsonToJavaCustomDate;
    }

    public void setJsonToJavaCustomDate(Date JsonToJavaCustomDate) {
        this.JsonToJavaCustomDate = JsonToJavaCustomDate;
    }

    public static void main(String[] args) {
        String json = "{\"JsonToJavaCustom_name\": \"Birthday Party\", \"JsonToJavaCustom_date\": \"2023-05-22T12:00:00Z\"}";

        try {
            ObjectMapper objectMapper = new ObjectMapper();
            JsonToJavaCustom JsonToJavaCustom = objectMapper.readValue(json, JsonToJavaCustom.class);
            System.out.println(JsonToJavaCustom.getJsonToJavaCustomName());
            System.out.println(JsonToJavaCustom.getJsonToJavaCustomDate());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class CustomDateDeserializer extends com.fasterxml.jackson.databind.JsonDeserializer<Date> {
    private static final StdDateFormat dateFormat = new StdDateFormat();

    @Override
    public Date deserialize(com.fasterxml.jackson.core.JsonParser parser, com.fasterxml.jackson.databind.DeserializationContext context) throws IOException {
        String dateStr = parser.getText();
        try {
            return dateFormat.parse(dateStr);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}