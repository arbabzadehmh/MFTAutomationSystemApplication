package com.mftplus.mftautomationsystemapplication.users.repository;

import com.mftplus.mftautomationsystemapplication.users.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, String> {
    User findByUsername(String username);
    boolean existsUserByUsername(String username);
}
