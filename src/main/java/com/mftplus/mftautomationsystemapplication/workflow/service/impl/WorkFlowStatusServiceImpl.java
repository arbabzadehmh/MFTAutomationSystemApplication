package com.mftplus.mftautomationsystemapplication.workflow.service.impl;

import com.mftplus.mftautomationsystemapplication.workflow.model.WorkFlowStatus;
import com.mftplus.mftautomationsystemapplication.workflow.repository.WorkFlowStatusRepository;
import com.mftplus.mftautomationsystemapplication.workflow.service.WorkFlowStatusService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WorkFlowStatusServiceImpl implements WorkFlowStatusService {

    private final WorkFlowStatusRepository workFlowStatusRepository;

    public WorkFlowStatusServiceImpl(WorkFlowStatusRepository workFlowStatusRepository) {
        this.workFlowStatusRepository = workFlowStatusRepository;
    }

    @Override
    public void save(WorkFlowStatus workFlowStatus) {
        workFlowStatusRepository.save(workFlowStatus);
    }

    @Override
    public void update(WorkFlowStatus workFlowStatus) {
        workFlowStatusRepository.save(workFlowStatus);
    }

    @Override
    public void delete(Long id) {
        workFlowStatusRepository.softDelete(id);
    }

    @Override
    public List<WorkFlowStatus> findAll() {
        return workFlowStatusRepository.findAllActive();
    }

    @Override
    public WorkFlowStatus findById(Long id) {
        return workFlowStatusRepository.findActiveById(id).orElse(null);
    }
}
