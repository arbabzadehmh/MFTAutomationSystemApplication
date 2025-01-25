package com.mftplus.mftautomationsystemapplication.projectmanager.service.impl;

import com.mftplus.mftautomationsystemapplication.projectmanager.model.Budget;
import com.mftplus.mftautomationsystemapplication.projectmanager.repository.BudgetRepository;
import com.mftplus.mftautomationsystemapplication.projectmanager.service.BudgetService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BudgetServiceImpl implements BudgetService {

    private final BudgetRepository budgetRepository;

    public BudgetServiceImpl(BudgetRepository budgetRepository) {
        this.budgetRepository = budgetRepository;
    }

    @Override
    public void save(Budget budget) {
        budgetRepository.save(budget);
    }

    @Override
    public void update(Budget budget) {
        budgetRepository.save(budget);
    }

    @Override
    public void delete(Long id) {
        budgetRepository.deleteById(id);
    }

    @Override
    public List<Budget> findAll() {
        return budgetRepository.findAll();
    }

    @Override
    public Budget findById(Long id) {
        return budgetRepository.findById(id).orElse(null);
    }
}
