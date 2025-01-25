package com.mftplus.mftautomationsystemapplication.projectmanager.repository;

import com.mftplus.mftautomationsystemapplication.projectmanager.model.Cost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CostRepository extends JpaRepository<Cost, Long> {
}
