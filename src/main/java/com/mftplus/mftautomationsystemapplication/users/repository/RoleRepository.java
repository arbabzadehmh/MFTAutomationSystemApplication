package com.mftplus.mftautomationsystemapplication.users.repository;

import com.mftplus.mftautomationsystemapplication.users.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public interface RoleRepository extends JpaRepository<Role, String> {
    Role findByName(String name);
}
