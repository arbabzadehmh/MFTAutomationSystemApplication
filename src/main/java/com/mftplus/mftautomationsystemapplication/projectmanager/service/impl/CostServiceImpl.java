package com.mftplus.mftautomationsystemapplication.projectmanager.service.impl;

import com.mftplus.mftautomationsystemapplication.projectmanager.model.Cost;
import com.mftplus.mftautomationsystemapplication.projectmanager.repository.CostRepository;
import com.mftplus.mftautomationsystemapplication.projectmanager.service.CostService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CostServiceImpl implements CostService {

    private final CostRepository costRepository;

    public CostServiceImpl(CostRepository costRepository) {
        this.costRepository = costRepository;
    }

    @Override
    public void save(Cost cost) {
        costRepository.save(cost);
    }

    @Override
    public void update(Cost cost) {
        costRepository.save(cost);
    }

    @Override
    public void delete(Long id) {
        costRepository.deleteById(id);
    }

    @Override
    public List<Cost> findAll() {
        return costRepository.findAll();
    }

    @Override
    public Cost findById(Long id) {
        return costRepository.findById(id).orElse(null);
    }
}
