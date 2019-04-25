package com.ashik;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by narayaa on 25-04-2019.
 */

@RestController
public class SpringBootJdbcController {
    @Autowired
    JdbcTemplate jdbc;
    @RequestMapping("/insert")
    public String index(){
        jdbc.execute("INSERT INTO USER(NAME, EMAIL) VALUE('ASHIK','ASHIK@GMAIL.COM')");
        return "data inserted successfully";
    }
}
