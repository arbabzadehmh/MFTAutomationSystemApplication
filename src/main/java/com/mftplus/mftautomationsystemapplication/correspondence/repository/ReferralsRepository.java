package com.mftplus.mftautomationsystemapplication.correspondence.repository;

import com.mftplus.mftautomationsystemapplication.correspondence.model.Referrals;
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
public interface ReferralsRepository extends JpaRepository<Referrals, Long> {

    @Modifying
    @Query("update referralsEntity r set r.deleted=true where r.id=:id")
    void softDelete(@Param("id") Long id);


    @Query("select r from referralsEntity r where r.deleted=false")
    List<Referrals> findAllActive();

    @Lock(LockModeType.WRITE)
    @Query("select r from referralsEntity r where r.id=:id and r.deleted=false")
    Optional<Referrals> findActiveById(@Param("id") Long id);
}
