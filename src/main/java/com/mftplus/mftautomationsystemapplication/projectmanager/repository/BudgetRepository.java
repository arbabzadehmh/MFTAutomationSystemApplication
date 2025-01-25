package com.mftplus.mftautomationsystemapplication.projectmanager.repository;

import com.mftplus.mftautomationsystemapplication.projectmanager.model.Budget;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BudgetRepository extends JpaRepository<Budget, Long> {
}
