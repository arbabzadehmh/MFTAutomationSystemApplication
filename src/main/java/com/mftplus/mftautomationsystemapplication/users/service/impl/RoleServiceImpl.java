package com.mftplus.mftautomationsystemapplication.users.service.impl;

import com.mftplus.mftautomationsystemapplication.users.model.Role;
import com.mftplus.mftautomationsystemapplication.users.repository.RoleRepository;
import com.mftplus.mftautomationsystemapplication.users.service.RoleService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {
    private final RoleRepository roleRepository;

    public RoleServiceImpl(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    @Override
    public void save(Role role) {
        roleRepository.save(role);
    }

    @Override
    public void update(Role role) {
        roleRepository.save(role);
    }

    @Override
    public void delete(String roleName) {
        roleRepository.deleteById(roleName);
    }

    @Override
    public Role findByName(String roleName) {
        return roleRepository.findByName(roleName);
    }

    @Override
    public List<Role> findAll() {
        return roleRepository.findAll();
    }
}
