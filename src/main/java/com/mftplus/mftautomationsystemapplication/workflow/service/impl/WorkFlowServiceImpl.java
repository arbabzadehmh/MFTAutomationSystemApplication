package com.mftplus.mftautomationsystemapplication.workflow.service.impl;

import com.mftplus.mftautomationsystemapplication.workflow.model.WorkFlow;
import com.mftplus.mftautomationsystemapplication.workflow.repository.WorkFlowRepository;
import com.mftplus.mftautomationsystemapplication.workflow.service.WorkFlowService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WorkFlowServiceImpl implements WorkFlowService {

    private final WorkFlowRepository workFlowRepository;

    public WorkFlowServiceImpl(WorkFlowRepository workFlowRepository) {
        this.workFlowRepository = workFlowRepository;
    }

    @Override
    public void save(WorkFlow workFlow) {
        workFlowRepository.save(workFlow);
    }

    @Override
    public void update(WorkFlow workFlow) {
        workFlowRepository.save(workFlow);
    }

    @Override
    public void delete(Long id) {
        workFlowRepository.softDelete(id);
    }

    @Override
    public List<WorkFlow> findAll() {
        return workFlowRepository.findAllActive();
    }

    @Override
    public WorkFlow findById(Long id) {
        return workFlowRepository.findActiveById(id).orElse(null);
    }
}
