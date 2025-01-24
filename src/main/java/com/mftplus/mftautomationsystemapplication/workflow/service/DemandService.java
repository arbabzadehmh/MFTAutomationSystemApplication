package com.mftplus.mftautomationsystemapplication.workflow.service;

import com.mftplus.mftautomationsystemapplication.workflow.model.Demand;

import java.util.List;

public interface DemandService
{
    Demand create(Demand demand);
    Demand update(Demand demand);
    void deleteById(Long id);
    Demand findById(Long id);
    List<Demand> findAll();
}