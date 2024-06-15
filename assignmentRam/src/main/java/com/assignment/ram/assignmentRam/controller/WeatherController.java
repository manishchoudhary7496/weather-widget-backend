package com.assignment.ram.assignmentRam.controller;




import com.assignment.ram.assignmentRam.model.WeatherData;
import com.assignment.ram.assignmentRam.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class WeatherController {

    @Autowired
    public WeatherService weatherService;

    @GetMapping("/weather/fixed")
    public List<WeatherData> getWeatherFixed() {
        return weatherService.getWeatherData(1000, 1);
    }

    @GetMapping("/weather/dynamic")
    public List<WeatherData> getWeatherDynamic(@RequestParam int pageSize) {
        return weatherService.getWeatherData(pageSize, 1);
    }

    @GetMapping("/weather/paged")
    public List<WeatherData> getWeatherPaged(@RequestParam int pageSize, @RequestParam int pageNumber) {
        return weatherService.getWeatherData(pageSize, pageNumber);
    }
}

