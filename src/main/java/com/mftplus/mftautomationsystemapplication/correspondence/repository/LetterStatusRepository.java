package com.mftplus.mftautomationsystemapplication.correspondence.repository;

import com.mftplus.mftautomationsystemapplication.correspondence.model.LetterStatus;
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
public interface LetterStatusRepository extends JpaRepository<LetterStatus, Long> {

    @Modifying
    @Query("update letterStatusEntity l set l.deleted=true where l.id=:id")
    void softDelete(@Param("id") Long id);


    @Query("select l from letterStatusEntity l where l.deleted=false")
    List<LetterStatus> findAllActive();

    @Lock(LockModeType.WRITE)
    @Query("select l from letterStatusEntity l where l.id=:id and l.deleted=false")
    Optional<LetterStatus> findActiveById(@Param("id") Long id);
}
