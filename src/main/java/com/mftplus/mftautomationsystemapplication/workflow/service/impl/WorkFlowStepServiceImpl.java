package com.mftplus.mftautomationsystemapplication.workflow.service.impl;

import com.mftplus.mftautomationsystemapplication.workflow.model.WorkFlowStep;
import com.mftplus.mftautomationsystemapplication.workflow.repository.WorkFlowStepRepository;
import com.mftplus.mftautomationsystemapplication.workflow.service.WorkFlowStepService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WorkFlowStepServiceImpl implements WorkFlowStepService {
    final WorkFlowStepRepository workFlowStepRepository;

    public WorkFlowStepServiceImpl(WorkFlowStepRepository workFlowStepRepository) {
        this.workFlowStepRepository = workFlowStepRepository;
    }

    @Override
    public void save(WorkFlowStep step) {
        workFlowStepRepository.save(step);

    }

    @Override
    public void update(WorkFlowStep step) {
        workFlowStepRepository.save(step);
    }

    @Override
    public void delete(Long id) {
        workFlowStepRepository.softDelete(id);
    }

    @Override
    public List<WorkFlowStep> findAll() {
        return workFlowStepRepository.findAllActive();
    }

    @Override
    public WorkFlowStep findById(Long id) {
        return workFlowStepRepository.findActiveById(id).orElse(null);
    }
}
