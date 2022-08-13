package com.learnAndWin.learnAndWin.controllers;

import com.learnAndWin.learnAndWin.models.User;
import com.learnAndWin.learnAndWin.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/users")
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping
    public List<User> getUserList() {
        return userRepository.findAll();
    }

    @PostMapping
    public User createUser(@RequestBody final User user) {
        return userRepository.saveAndFlush(user);
    }
}
