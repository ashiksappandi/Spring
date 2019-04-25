package com.ashik;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("/")
    public List<UserRecord> getAllUser(){
        return userService.getAllUsers();
    }
    @RequestMapping(value="/add-user", method=RequestMethod.POST)
    public void addUser(@RequestBody UserRecord userRecord){
        userService.addUser(userRecord);
    }

    @RequestMapping(value="/user/{id}", method=RequestMethod.GET)
    public List<UserRecord> getUser(@PathVariable("id") String id){
        return userService.getUser(id);
    }
}