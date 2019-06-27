package com.ashik.weather.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by narayaa on 26-06-2019.
 */

@Controller
public class WeatherController {

    @Value("${app.weather.city}")
    private String appWeatherCity;

    @Value("${app.weather.cityList}")
    private String appWeatherCityList;

    @Value("${app.weather.api.key}")
    private String appWeatherApiKey;

    @Value("${app.weather.url}")
    private String appWeatherURL;

    private WeatherService weatherService;

    @Autowired
    public WeatherController(WeatherService weatherService) {
        this.weatherService = weatherService;
    }

    @RequestMapping(value = "/weather", method = RequestMethod.GET)
    public ModelAndView weather(@ModelAttribute Weather weather) {
        Weather result = weatherService.getWeather(appWeatherCity, appWeatherApiKey, appWeatherURL);
        ModelAndView modelAndView = new ModelAndView("summary");
        modelAndView.addObject("weather", result);
        return modelAndView;
    }


    @RequestMapping(value = "/weathers", method = RequestMethod.GET)
    public ModelAndView weathers(@ModelAttribute Weather weather) {

        String[] cities = appWeatherCityList.split(",");
        List<Weather> weatherList = new ArrayList<>();
        for (int i = 0; i < cities.length; i++) {
            Weather result = weatherService.getWeather(cities[i], appWeatherApiKey, appWeatherURL);
            weatherList.add(result);
            System.out.println(result.getCity() +" - " +result.getTemp());
        }
        ModelAndView modelAndView = new ModelAndView("summary");
        modelAndView.addObject("weatherList", weatherList);
        System.out.println(weatherList.get(0).getCity()+" -- "+weatherList.get(0).getTemp());
        return modelAndView;
    }
}
