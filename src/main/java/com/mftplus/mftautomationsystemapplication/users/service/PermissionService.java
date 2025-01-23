package com.mftplus.mftautomationsystemapplication.users.service;

import com.mftplus.mftautomationsystemapplication.users.model.Permission;

import java.util.List;

public interface PermissionService {
    void save(Permission permission);
    void update(Permission permission);
    void delete(Long id);
    List<Permission> findAll();
    Permission findById(Long id);
}
