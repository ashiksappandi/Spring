package com.ashik.weather.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by narayaa on 26-06-2019.
 */
@ConfigurationProperties("app.weather")

@RestController
public class WeatherController {

    @Value("${app.weather.city}")
    private String appWeatherCity;

    @Value("${app.weather.api.key}")
    private String appWeatherApiKey;

    @Value("${app.weather.url}")
    private String appWeatherURL;


    @RequestMapping(value="/weather", method = RequestMethod.GET)
    public String getWeather(){

        WeatherService weatherService = new WeatherService();
        return weatherService.getWeather(appWeatherCity,appWeatherApiKey,appWeatherURL);
    }


    @RequestMapping(value="/weather2", method=RequestMethod.GET)
    public ModelAndView getWeather(@ModelAttribute Weather weather){
        WeatherService weatherService = new WeatherService();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("summary");
        modelAndView.addObject("weather", weatherService.getWeather(appWeatherCity, appWeatherApiKey, appWeatherURL));
        return modelAndView;
    }
}
