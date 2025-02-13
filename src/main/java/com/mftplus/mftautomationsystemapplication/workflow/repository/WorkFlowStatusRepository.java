package com.mftplus.mftautomationsystemapplication.workflow.repository;

import com.mftplus.mftautomationsystemapplication.workflow.model.WorkFlow;
import com.mftplus.mftautomationsystemapplication.workflow.model.WorkFlowStatus;
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
public interface WorkFlowStatusRepository extends JpaRepository<WorkFlowStatus, Long> {

    @Modifying
    @Query("update workFlowStatusEntity w set w.deleted=true where w.id=:id")
    void softDelete(@Param("id") Long id);


    @Query("select w from workFlowStatusEntity w where w.deleted=false")
    List<WorkFlowStatus> findAllActive();

    @Lock(LockModeType.WRITE)
    @Query("select w from workFlowStatusEntity w where w.id=:id and w.deleted=false")
    Optional<WorkFlowStatus> findActiveById(@Param("id") Long id);
}
