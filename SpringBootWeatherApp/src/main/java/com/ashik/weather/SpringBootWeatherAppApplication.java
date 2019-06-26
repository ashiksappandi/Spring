package com.ashik.weather;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

/**
 * Created by narayaa on 17-06-2019.
 */
@SpringBootApplication
@EnableCaching(proxyTargetClass = true)
public class SpringBootWeatherAppApplication {

    public static void main(String[] args){
        SpringApplication.run(SpringBootWeatherAppApplication.class,args);
    }
}
