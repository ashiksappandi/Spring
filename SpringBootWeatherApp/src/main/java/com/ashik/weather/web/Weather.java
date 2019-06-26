package com.ashik.weather.web;

/**
 * Created by narayaa on 26-06-2019.
 */
public class Weather {
    private String city;
    private String temp;

    public Weather(String city, String temp) {
        this.city = city;
        this.temp = temp;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getTemp() {
        return temp;
    }

    public void setTemp(String temp) {
        this.temp = temp;
    }
}
