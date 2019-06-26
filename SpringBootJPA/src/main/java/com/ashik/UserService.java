package com.ashik;

/**
 * Created by narayaa on 26-04-2019.
 */
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    public List<UserRecord> getAllUsers(){
        List<UserRecord>userRecords = new ArrayList<>();
        userRepository.findAll().forEach(userRecords::add);
        return userRecords;
    }
    public Optional<UserRecord> getUser(int id){
        return userRepository.findById(String.valueOf(id));
    }
    public void addUser(UserRecord userRecord){
        userRepository.save(userRecord);
    }
    public void delete(String id){
        userRepository.deleteById(id);
    }

    public String getWeather() {
        RestTemplate restTemplate = new RestTemplate();
        //String result = restTemplate.getForObject("https://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b6907d289e10d714a6e88b30761fae22", String.class);
        String result = restTemplate.getForObject("http://api.openweathermap.org/data/2.5/weather?q=London&appid=ee27764189284846bb3f5021e1ea85e5", String.class);
        System.out.println(result);
        return result;
    }
}