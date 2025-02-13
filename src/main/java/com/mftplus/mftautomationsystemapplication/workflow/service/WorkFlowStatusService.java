package com.mftplus.mftautomationsystemapplication.workflow.service;

import com.mftplus.mftautomationsystemapplication.workflow.model.WorkFlowStatus;

import java.util.List;

public interface WorkFlowStatusService {
    void save(WorkFlowStatus workFlowStatus);
    void update(WorkFlowStatus workFlowStatus);
    void delete(Long id);
    List<WorkFlowStatus> findAll();
    WorkFlowStatus findById(Long id);
}
