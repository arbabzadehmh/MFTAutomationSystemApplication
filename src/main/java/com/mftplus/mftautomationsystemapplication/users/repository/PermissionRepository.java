package com.mftplus.mftautomationsystemapplication.users.repository;

import com.mftplus.mftautomationsystemapplication.users.model.Permission;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PermissionRepository extends JpaRepository<Permission, Long> {
}
