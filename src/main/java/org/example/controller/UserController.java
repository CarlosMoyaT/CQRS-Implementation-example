package org.example.controller;


import org.example.domain.User;
import org.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    // save operation
    @PostMapping("/users")
    public User saveUser(@Validated @RequestBody User user) {
        return userService.saveUser(user);

    }
    // read operation
    @GetMapping("/users")
    public List<User> fetchUserList() {
        return userService.fetchUserList();
    }
    // update operation
    @PutMapping("users/{id}")
    public User updateUser(@RequestBody User user, @PathVariable("id") String userId) {
        return UserService.updateUser(user, userId);
    }
    // delete operation
    @DeleteMapping("users/{id}")
    public String deleteUserById(@PathVariable("id") String userId) {
        userService.deleteUserId(userId);
        return "Deleted succesfully";
    }
}
