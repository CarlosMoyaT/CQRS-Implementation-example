package org.example.service;

import org.example.domain.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {

    //save
    User saveUser(User user);
    //read
    List<User> fetchUserList();
    //update
    User updateUser(User user, String userId);
    //delete
    void deleteUserId(String userId);
}
