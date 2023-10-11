package com.next.user_service.controller;

import com.next.user_service.entity.User;
import com.next.user_service.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping(value = "/user")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping(value = "/add")
    public User addUser(@RequestBody User user) {
        return userService.addUser(user);
    }

    @GetMapping
    public List<User> fetchAllUsers() {
        return userService.fetchAllUsers();
    }

    @GetMapping(value = "/check")
    public Boolean checkLogin(@RequestParam String userName, @RequestParam String password) {
        return userService.checkLogin(userName, password);
    }
}
