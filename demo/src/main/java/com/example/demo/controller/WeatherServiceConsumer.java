package com.example.demo.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class WeatherServiceConsumer {
    
	 @GetMapping("/Weather")
	    public void weather() {
        String apiKey = "f882172ddf5353f07bedd38e4d7b14db";
        String url = "http://api.openweathermap.org/data/2.5/weather?q=Dallas&units=metric&appid=" + apiKey;
        RestTemplate restTemplate = new RestTemplate();
        WeatherData weatherData = restTemplate.getForObject(url, WeatherData.class);
        double temperature = weatherData.getMain().getTemp();
        System.out.println("The current temperature in Dallas is " + temperature + "°C.");
    }
}

class WeatherData {
    private MainData main;

    public MainData getMain() {
        return main;
    }

    public void setMain(MainData main) {
        this.main = main;
    }
}

class MainData {
    private double temp;

    public double getTemp() {
        return temp;
    }

    public void setTemp(double temp) {
        this.temp = temp;
    }
}