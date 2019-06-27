package com.ashik.weather.web;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by narayaa on 26-06-2019.
 */
@Service
public class WeatherService {
    public Weather getWeather(String city, String id, String URL) {
        RestTemplate restTemplate = new RestTemplate();
        Weather result = restTemplate.getForObject(URL+"?q="+city+"&appid="+id, Weather.class);
        System.out.println(result);
        return result;
    }
}
