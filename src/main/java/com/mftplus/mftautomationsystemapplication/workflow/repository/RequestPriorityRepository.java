package com.mftplus.mftautomationsystemapplication.workflow.repository;

import com.mftplus.mftautomationsystemapplication.workflow.model.RequestPriority;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RequestPriorityRepository extends JpaRepository<RequestPriority, Long>
{

}