package com.assignment.ram.assignmentRam.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class WeatherData {

    private int id;
    private String city;
    private double temperature;
    private double humidity;
    private String description;

    public WeatherData(int id, String city, double temperature, double humidity, String description) {
        this.id = id;
        this.city = city;
        this.temperature = temperature;
        this.humidity = humidity;
        this.description = description;
    }

    @JsonProperty
    public int getId() {
        return id;
    }

    @JsonProperty
    public String getCity() {
        return city;
    }

    @JsonProperty
    public double getTemperature() {
        return temperature;
    }

    @JsonProperty
    public double getHumidity() {
        return humidity;
    }

    @JsonProperty
    public String getDescription() {
        return description;
    }

    // Optionally, you can add setters if needed

    @Override
    public String toString() {
        return "WeatherData{" +
                "id=" + id +
                ", city='" + city + '\'' +
                ", temperature=" + temperature +
                ", humidity=" + humidity +
                ", description='" + description + '\'' +
                '}';
    }
}
