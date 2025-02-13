package com.mftplus.mftautomationsystemapplication.workflow.controller.api;

import com.mftplus.mftautomationsystemapplication.workflow.model.WorkFlowStatus;
import com.mftplus.mftautomationsystemapplication.workflow.service.WorkFlowStatusService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/rest/workFlowStatuses")
public class WorkFlowStatusApi {

    private final WorkFlowStatusService workFlowStatusService;

    public WorkFlowStatusApi(WorkFlowStatusService workFlowStatusService) {
        this.workFlowStatusService = workFlowStatusService;
    }

    @GetMapping
    public Object findAllWorkFlowStatuses() {
        return workFlowStatusService.findAll();
    }

    @GetMapping("/{id}")
    public Object findWorkFlowStatusById(@PathVariable Long id) {
        return workFlowStatusService.findById(id);
    }

    @PostMapping
    public void addWorkFlowStatus(@RequestBody WorkFlowStatus workFlowStatus) {
        workFlowStatusService.save(workFlowStatus);
    }

    @PutMapping
    public void updateWorkFlowStatus(@RequestBody WorkFlowStatus workFlowStatus) {
        workFlowStatusService.update(workFlowStatus);
    }

    @DeleteMapping("/{id}")
    public void deleteWorkFlowStatus(@PathVariable Long id) {
        workFlowStatusService.delete(id);
    }
}
