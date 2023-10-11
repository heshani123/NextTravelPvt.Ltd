package com.next.user_service.service;

import com.next.user_service.entity.User;
import com.next.user_service.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User addUser(User user) {
        return userRepository.save(user);
    }

    public Boolean checkLogin(String userName, String password) {
        return userRepository.existsUserByUserNameAndPassword(userName, password);
    }

    public List<User> fetchAllUsers() {
        return userRepository.findAll();
    }
}
