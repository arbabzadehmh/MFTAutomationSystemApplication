package com.mftplus.mftautomationsystemapplication.workflow.service;

import com.mftplus.mftautomationsystemapplication.workflow.model.WorkFlowStep;

import java.util.List;

public interface WorkFlowStepService {
    void save(WorkFlowStep step);
    void update(WorkFlowStep step);
    void delete(Long id);
    List<WorkFlowStep> findAll();
    WorkFlowStep findById(Long id);
}
