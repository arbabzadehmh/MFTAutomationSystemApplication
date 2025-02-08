package com.mftplus.mftautomationsystemapplication.correspondence.repository;

import com.mftplus.mftautomationsystemapplication.correspondence.model.Appeal;
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
public interface AppealRepository extends JpaRepository<Appeal, Long> {

    @Modifying
    @Query("update appealEntity a set a.deleted=true where a.id=:id")
    void softDelete(@Param("id") Long id);


    @Query("select a from appealEntity a where a.deleted=false")
    List<Appeal> findAllActive();

    @Lock(LockModeType.WRITE)
    @Query("select a from appealEntity a where a.id=:id and a.deleted=false")
    Optional<Appeal> findActiveById(@Param("id") Long id);
}
