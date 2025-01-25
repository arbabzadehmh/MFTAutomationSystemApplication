package com.mftplus.mftautomationsystemapplication.projectmanager.repository;

import com.mftplus.mftautomationsystemapplication.projectmanager.model.SubProject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubProjectRepository extends JpaRepository<SubProject, Long> {
}
