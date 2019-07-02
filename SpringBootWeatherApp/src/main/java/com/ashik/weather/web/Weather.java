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

    private float tempC;

    private float tempMin;

    private float tempMax;

    private int pressure;

    private int humidity;

    @JsonProperty("main")
    private void tempObj(Map<String,Object> tempData) {
        this.temp = (Double) tempData.get("temp");
        this.tempC = (float) (this.temp - 273.15);
        double tempMax_temp = (Double)tempData.get("temp_max");
        this.tempMax = (float) (tempMax_temp - 273.15);
        double tempMin_temp = (Double)tempData.get("temp_min");
        this.tempMin = (float) (tempMin_temp - 273.15);
        this.pressure = (int) tempData.get("pressure");
        this.humidity = (int) tempData.get("humidity");
    }

    public Weather(){
    }

    public Weather(String city){
        this.city = city;
    }

    public Weather(String city, Double temp, float tempC, float tempMin, float tempMax, int pressure, int humidity) {
        this.city = city;
        this.temp = temp;
        this.tempC = tempC;
        this.tempMin = tempMin;
        this.tempMax = tempMax;
        this.pressure = pressure;
        this.humidity = humidity;
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

    public float getTempC() {
        return tempC;
    }

    public void setTempC(float tempC) {
        this.tempC = tempC;
    }

    public float getTempMin() {
        return tempMin;
    }

    public void setTempMin(float tempMin) {
        this.tempMin = tempMin;
    }

    public float getTempMax() {
        return tempMax;
    }

    public void setTempMax(float tempMax) {
        this.tempMax = tempMax;
    }

    public int getPressure() {
        return pressure;
    }

    public void setPressure(int pressure) {
        this.pressure = pressure;
    }

    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }
}
