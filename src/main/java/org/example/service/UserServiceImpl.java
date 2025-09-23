package org.example.service;


import org.example.domain.User;
import org.example.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public interface UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    //save operation
    @Override
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    //read operation
    //update operation
    //delete operation


}
