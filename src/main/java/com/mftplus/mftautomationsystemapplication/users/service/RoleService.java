package com.mftplus.mftautomationsystemapplication.users.service;

import com.mftplus.mftautomationsystemapplication.users.model.Role;

import java.util.List;

public interface RoleService {
    void save(Role role);
    void update(Role role);
    void delete(String roleName);
    List<Role> findAll();
    Role findByName(String roleName);
}
