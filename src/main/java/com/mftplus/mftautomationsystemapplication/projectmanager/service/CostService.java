package com.mftplus.mftautomationsystemapplication.projectmanager.service;

import com.mftplus.mftautomationsystemapplication.projectmanager.model.Cost;

import java.util.List;

public interface CostService {
    void save(Cost cost);
    void update(Cost cost);
    void delete(Long id);
    List<Cost> findAll();
    Cost findById(Long id);
}
