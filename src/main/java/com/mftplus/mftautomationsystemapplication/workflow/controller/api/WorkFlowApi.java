package com.mftplus.mftautomationsystemapplication.workflow.controller.api;

import com.mftplus.mftautomationsystemapplication.workflow.model.WorkFlow;
import com.mftplus.mftautomationsystemapplication.workflow.service.WorkFlowService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/rest/workFlows")
public class WorkFlowApi {

    private final WorkFlowService workFlowService;

    public WorkFlowApi(WorkFlowService workFlowService) {
        this.workFlowService = workFlowService;
    }

    @GetMapping
    public Object findAllWorkFlows() {
       return workFlowService.findAll();
    }

    @GetMapping("/{id}")
    public Object findWorkFlowById(@PathVariable Long id) {
        return workFlowService.findById(id);
    }

    @PostMapping
    public void addWorkFlow(@RequestBody WorkFlow workFlow) {
        workFlowService.save(workFlow);
    }

    @PutMapping
    public void updateWorkFlow(@RequestBody WorkFlow workFlow) {
        workFlowService.update(workFlow);
    }

    @DeleteMapping("/{id}")
    public void deleteWorkFlow(@PathVariable Long id) {
        workFlowService.delete(id);
    }
}
