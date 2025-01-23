package com.mftplus.mftautomationsystemapplication.users.service.impl;

import com.mftplus.mftautomationsystemapplication.users.model.User;
import com.mftplus.mftautomationsystemapplication.users.repository.UserRepository;
import com.mftplus.mftautomationsystemapplication.users.service.UserService;


import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
//    private BCryptPasswordEncoder bCryptPasswordEncoder() {
//        return new BCryptPasswordEncoder();
//    }

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void save(User user) {
        if (!userRepository.existsUserByUsername(user.getUsername())) {
//            user.setPassword(bCryptPasswordEncoder().encode(user.getPassword()));
            userRepository.save(user);
        }
    }

    @Override
    public void update(User user) {
//        user.setPassword(bCryptPasswordEncoder().encode(user.getPassword()));
        userRepository.save(user);
    }

    @Override
    public void delete(String username) {
        userRepository.deleteById(username);
    }

    @Override
    public User findByUsername(String username) {
        return userRepository.findById(username).orElse(null);
    }

    @Override
    public boolean existsByUsername(String username) {
        return userRepository.existsById(username);
    }

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

}
