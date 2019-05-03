package com.ashik;

/**
 * Created by narayaa on 26-04-2019.
 */
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}