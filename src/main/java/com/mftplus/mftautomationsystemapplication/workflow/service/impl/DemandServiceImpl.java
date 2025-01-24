package com.mftplus.mftautomationsystemapplication.workflow.service.impl;

import com.mftplus.mftautomationsystemapplication.workflow.model.Demand;
import com.mftplus.mftautomationsystemapplication.workflow.repository.DemandRepository;
import com.mftplus.mftautomationsystemapplication.workflow.service.DemandService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DemandServiceImpl implements DemandService
{
    private final DemandRepository demandRepository;

    public DemandServiceImpl(DemandRepository demandRepository) {
        this.demandRepository = demandRepository;
    }

    @Override
    public Demand create(Demand demand) {
        return demandRepository.save(demand);
    }

    @Override
    public Demand update(Demand demand) {
        return demandRepository.save(demand);
    }

    @Override
    public void deleteById(Long id) {
        demandRepository.deleteById(id);
    }

    @Override
    public Demand findById(Long id) {
        return demandRepository.findById(id).orElse(null);
    }

    @Override
    public List<Demand> findAll() {
        return demandRepository.findAll();
    }
}