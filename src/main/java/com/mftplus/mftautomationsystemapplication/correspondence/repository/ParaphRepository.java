package com.mftplus.mftautomationsystemapplication.correspondence.repository;

import com.mftplus.mftautomationsystemapplication.correspondence.model.Paraph;
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
public interface ParaphRepository extends JpaRepository<Paraph, Long> {

    @Modifying
    @Query("update paraphEntity p set p.deleted=true where p.id=:id")
    void softDelete(@Param("id") Long id);


    @Query("select p from paraphEntity p where p.deleted=false")
    List<Paraph> findAllActive();

    @Lock(LockModeType.WRITE)
    @Query("select p from paraphEntity p where p.id=:id and p.deleted=false")
    Optional<Paraph> findActiveById(@Param("id") Long id);
}
