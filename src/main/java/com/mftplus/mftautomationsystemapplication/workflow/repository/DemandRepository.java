package com.mftplus.mftautomationsystemapplication.workflow.repository;

import com.mftplus.mftautomationsystemapplication.workflow.model.Demand;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DemandRepository extends JpaRepository<Demand, Long>
{

}