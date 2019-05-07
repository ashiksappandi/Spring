package com.ashik;

/**
 * Created by narayaa on 06-05-2019.
 */

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class SpringBootJdbcController {

    @Autowired
    JdbcTemplate jdbc;
    @RequestMapping("/insert")
    public String index(){
        jdbc.execute("insert into users(id,name,email)values(2,'javatpoint','java@javatpoint.com')");
        return"data inserted Successfully";
    }
}