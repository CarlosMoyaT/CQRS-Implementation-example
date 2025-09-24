package org.example.service;


import org.example.domain.User;
import org.example.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

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
    @Override
    public List<User> fetchUserList() {
        return (List<User>) userRepository.findAll();
    }
    //update operation
    @Override
    public User updateUser(User user, String userId) {
        User userDB = userRepository.findById(userId).get();

        if (Objects.nonNull(user.getUserName()) &&!"".equalsIgnoreCase(user.getUserName())) {
            userDB.setUserName(user.getUserName());
        }

        if (Objects.nonNull(user.getUserAddress()) &&!"".equalsIgnoreCase(user.getUserAddress())) {
            userDB.setUserAddress(user.getUserAddress());
        }

        return userRepository.save(userDB);

    }

    //delete operation
    @Override
    public void deleteUserById(String userId) {
        userRepository.deleteById(userId);
    }


}
