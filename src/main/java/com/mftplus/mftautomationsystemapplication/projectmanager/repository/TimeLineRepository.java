package com.mftplus.mftautomationsystemapplication.projectmanager.repository;

import com.mftplus.mftautomationsystemapplication.projectmanager.model.TimeLine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TimeLineRepository extends JpaRepository<TimeLine, Long> {
}
