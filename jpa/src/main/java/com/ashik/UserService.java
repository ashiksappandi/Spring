package com.ashik;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<UserRecord> getAllUsers(){
        List<UserRecord>userRecords = new ArrayList<>();
        userRepository.findAll().forEach(userRecords::add);
        return userRecords;
    }

    public List<UserRecord> getUser(String id){
        List<UserRecord>userRecords = new ArrayList<>();
        userRepository.findById(id).ifPresent(userRecords::add);
        return userRecords;
    }

/*    public void getUser(String id){
        userRepository.findById(id);
    }
*/

    public void addUser(UserRecord userRecord){
        userRepository.save(userRecord);
    }
    public void delete(String id){
        userRepository.deleteById(id);
    }
}