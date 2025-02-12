package com.mftplus.mftautomationsystemapplication.workflow.repository;

import com.mftplus.mftautomationsystemapplication.workflow.model.WorkFlowStepStatus;
import jakarta.persistence.LockModeType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Lock;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface WorkFlowStepStatusRepository extends JpaRepository<WorkFlowStepStatus, Long> {
    @Modifying
    @Query("update workFlowStepStatusEntity w set w.deleted=true where w.id=:id")
    void softDelete(@Param("id") Long id);


    @Query("select w from workFlowStepStatusEntity w where w.deleted=false ")
    List<WorkFlowStepStatus> findAllActive();

    @Lock(LockModeType.WRITE)
    @Query("select w from workFlowStepStatusEntity w where w.deleted=false and w.id=:id ")
    Optional<WorkFlowStepStatus> findActiveById(@Param("id") Long id);
}
