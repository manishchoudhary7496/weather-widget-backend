package com.assignment.ram.assignmentRam.service;




import com.assignment.ram.assignmentRam.model.WeatherData;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class WeatherService {

    private List<WeatherData> weatherData;

    public WeatherService() {
        // Initialize with dummy data for demonstration purposes
        weatherData = new ArrayList<>();
        for (int i = 1; i <= 2000; i++) {
            System.out.println("=====adding cities=======");
            weatherData.add(new WeatherData(i, "City" + i, 15 + i % 10, 70 + i % 20, "Description" + i));
        }
    }

    public List<WeatherData> getWeatherData(int pageSize, int pageNumber) {
        int start = (pageNumber - 1) * pageSize;
        int end = Math.min(start + pageSize, weatherData.size());
        return weatherData.subList(start, end);
    }
}
