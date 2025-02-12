package com.mftplus.mftautomationsystemapplication.workflow.service;

import com.mftplus.mftautomationsystemapplication.workflow.model.WorkFlowStepStatus;

import java.util.List;

public interface WorkFlowStepStatusService {
    void save(WorkFlowStepStatus stepStatus);
    void update(WorkFlowStepStatus stepStatus);
    void delete(Long id);
    List<WorkFlowStepStatus> findAll();
    WorkFlowStepStatus findById(Long id);
}
