package com.mftplus.mftautomationsystemapplication.users.service;

import com.mftplus.mftautomationsystemapplication.users.model.User;

import java.util.List;

public interface UserService {
    void save(User user);
    void update(User user);
    void delete(String username);
    List<User> findAll();
    User findByUsername(String username);
    boolean existsByUsername(String username);
}
