package com.mftplus.mftautomationsystemapplication.workflow.controller;


import com.mftplus.mftautomationsystemapplication.workflow.model.WorkFlowStepStatus;
import com.mftplus.mftautomationsystemapplication.workflow.service.WorkFlowStepStatusService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/rest/workStepStatuses")
public class WorkFlowStepStatusApi {
    final private WorkFlowStepStatusService workFlowStepStatusService;

    public WorkFlowStepStatusApi(WorkFlowStepStatusService workFlowStepStatusService) {
        this.workFlowStepStatusService = workFlowStepStatusService;
    }

    @GetMapping
    public Object findAllWorkFlowStepStatus() {
        return workFlowStepStatusService.findAll();
    }

    @GetMapping("/{id}")
    public Object findWorkFlowStepStatus(@PathVariable Long id) {
        return workFlowStepStatusService.findById(id);
    }

    @PostMapping
    public void addWorkFlowStepStatus(@RequestBody WorkFlowStepStatus workFlowStepStatus) {
        workFlowStepStatusService.save(workFlowStepStatus);
    }

    @PutMapping
    public void updateWorkFlowStepStatus(@RequestBody WorkFlowStepStatus workFlowStepStatus) {
        workFlowStepStatusService.save(workFlowStepStatus);
    }
    @DeleteMapping("/{id}")
    public void deleteWorkFlowStepStatus(@PathVariable Long id) {
        workFlowStepStatusService.delete(id);
    }


}
