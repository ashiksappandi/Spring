package com.ashik.weather.web;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by narayaa on 26-06-2019.
 */
@Service
public class WeatherService {
    public String getWeather(String city, String id, String URL) {
        RestTemplate restTemplate = new RestTemplate();
        String result = restTemplate.getForObject(URL+"?q="+city+"&appid="+id, String.class);
        System.out.println(result);
        Weather weather = new Weather(city, "36");
        return result;
    }
}
