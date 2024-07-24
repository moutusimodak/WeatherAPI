package com.example.Weather;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class Weather {

    @Value("${weather.api.key}")
    private String apikey;

    @Value("${weather.api.url}")
    private String apiurl;

    @Autowired
    private RestTemplate restTemplate;



    public  String  getWeather(String city){
        String url= apiurl.replace("{city name}",city).replace("{API key}",apikey);
        String myweather= this.restTemplate.getForObject(url,String.class);
        return  myweather;

    }
}
