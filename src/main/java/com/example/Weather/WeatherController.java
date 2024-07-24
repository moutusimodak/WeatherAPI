package com.example.Weather;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WeatherController {
        @Autowired
        Weather w;

        @GetMapping("/weather/{city}")
        String getWeather(@PathVariable String city){

            return w.getWeather(city);
        }
    }


