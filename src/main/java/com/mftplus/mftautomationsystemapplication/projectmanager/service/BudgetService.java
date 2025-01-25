package com.mftplus.mftautomationsystemapplication.projectmanager.service;

import com.mftplus.mftautomationsystemapplication.projectmanager.model.Budget;

import java.util.List;

public interface BudgetService {
    void save(Budget budget);
    void update(Budget budget);
    void delete(Long id);
    List<Budget> findAll();
    Budget findById(Long id);
}
