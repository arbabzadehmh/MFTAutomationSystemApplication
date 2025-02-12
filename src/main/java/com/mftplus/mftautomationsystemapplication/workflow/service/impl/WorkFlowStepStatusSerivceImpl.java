package com.mftplus.mftautomationsystemapplication.workflow.service.impl;

import com.mftplus.mftautomationsystemapplication.workflow.model.WorkFlowStepStatus;
import com.mftplus.mftautomationsystemapplication.workflow.repository.WorkFlowStepStatusRepository;
import com.mftplus.mftautomationsystemapplication.workflow.service.WorkFlowStepStatusService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class WorkFlowStepStatusSerivceImpl implements WorkFlowStepStatusService {
   final WorkFlowStepStatusRepository workFlowStepStatusRepository;

    public WorkFlowStepStatusSerivceImpl(WorkFlowStepStatusRepository workFlowStepStatusRepository) {
        this.workFlowStepStatusRepository = workFlowStepStatusRepository;
    }

    @Override
    public void save(WorkFlowStepStatus stepStatus) {
        workFlowStepStatusRepository.save(stepStatus);

    }

    @Override
    public void update(WorkFlowStepStatus stepStatus) {
        workFlowStepStatusRepository.save(stepStatus);

    }

    @Override
    public void delete(Long id) {
        workFlowStepStatusRepository.softDelete(id);
    }


    @Override
    public List<WorkFlowStepStatus> findAll() {
        return workFlowStepStatusRepository.findAllActive();
    }

    @Override
    public WorkFlowStepStatus findById(Long id) {
        return workFlowStepStatusRepository.findActiveById(id).orElse(null);
    }
}
