package com.mftplus.mftautomationsystemapplication.workflow.controller;


import com.mftplus.mftautomationsystemapplication.workflow.model.WorkFlowStep;
import com.mftplus.mftautomationsystemapplication.workflow.service.WorkFlowStepService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/rest/workFlowSteps")
public class WorkFlowStepApi {
    private final WorkFlowStepService workFlowStepService;

    public WorkFlowStepApi(WorkFlowStepService workFlowStepService) {
        this.workFlowStepService = workFlowStepService;
    }

    @GetMapping
    public Object findAllWorkFlowSteps() {
        return workFlowStepService.findAll();
    }

    @GetMapping("/{id}")
    public Object findWorkFlowStepById(@PathVariable Long id) {
        return workFlowStepService.findById(id);
    }

    @PostMapping
    public void addWorkFlowStep(@RequestBody WorkFlowStep workFlowStep) {
        workFlowStepService.save(workFlowStep);
    }

    @PutMapping
    public void updateWorkFlowStep(@RequestBody WorkFlowStep workFlowStep) {
        workFlowStepService.update(workFlowStep);
    }

    @DeleteMapping("/{id}")
    public void deleteWorkFlowStep(@PathVariable Long id) {
        workFlowStepService.delete(id);
    }

}
