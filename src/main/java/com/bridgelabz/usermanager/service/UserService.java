package com.bridgelabz.usermanager.service;

import com.bridgelabz.usermanager.model.User;
import com.bridgelabz.usermanager.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    // Get all users
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    // Get user by Id
    public Optional<User> getUserById(Long id) {
        return userRepository.findById(id);
    }

    // Add new user
    public User addUser(User user) {
        return userRepository.save(user);
    }

    // Update user
    public User updateUser(Long id, User user) {
        user.setId(id);
        return userRepository.save(user);
    }

    // Delete user
    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
}
