package com.mftplus.mftautomationsystemapplication.workflow.service;

import com.mftplus.mftautomationsystemapplication.workflow.model.WorkFlow;


import java.util.List;

public interface WorkFlowService {
    void save(WorkFlow workFlow);
    void update(WorkFlow workFlow);
    void delete(Long id);
    List<WorkFlow> findAll();
    WorkFlow findById(Long id);
}
