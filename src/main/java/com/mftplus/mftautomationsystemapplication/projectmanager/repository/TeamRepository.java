package com.mftplus.mftautomationsystemapplication.projectmanager.repository;

import com.mftplus.mftautomationsystemapplication.projectmanager.model.Team;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeamRepository extends JpaRepository<Team, Long> {
}
