package com.ashik.weather.web;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Map;

/**
 * Created by narayaa on 26-06-2019.
 */

@JsonIgnoreProperties(ignoreUnknown = true)
public class Weather {

    @JsonProperty("name")
    private String city;

    private Double temp;

    @JsonProperty("main")
    private void unpackNested(Map<String,Object> main) {
        this.temp = (Double) main.get("temp");
    }

    public Weather(){
    }

    public Weather(String city){
        this.city = city;
    }


    public Weather(String city, Double temp) {
        this.city = city;
        this.temp = temp;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Double getTemp() {
        return temp;
    }

    public void setTemp(Double temp) {
        this.temp = temp;
    }
}
