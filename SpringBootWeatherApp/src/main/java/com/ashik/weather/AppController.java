package com.ashik.weather;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by narayaa on 04-06-2019.
 */

@Controller
public class AppController {

    @RequestMapping("/")
    public void welcome(){
        Weather weatehr = new Weather();
        weatehr.getWeather();
    }
}
