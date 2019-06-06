package com.ashik.weather;

import sun.net.www.http.HttpClient;
import org.apache.http.impl.client

/**
 * Created by narayaa on 04-06-2019.
 */
public class Weather {
    public void getWeather(){
        //       api.openweathermap.org/data/2.5/weather?q=London&apiid=84ed2b7a36e96eadd74a812122853e4a
        //       https://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=ee27764189284846bb3f5021e1ea85e5

        String url = "api.openweathermap.org/data/2.5/weather?q=London&apiid="+ new ApiKey().getApi();

        CloseableHttpClient client = new
    }
}

