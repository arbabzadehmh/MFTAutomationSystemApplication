package com.mftplus.mftautomationsystemapplication.workflow.controller;

import com.mftplus.mftautomationsystemapplication.workflow.model.Demand;
import com.mftplus.mftautomationsystemapplication.workflow.service.DemandService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/workflow")
public class DemandController
{
    private final DemandService demandService;

    public DemandController(DemandService demandService) {
        this.demandService = demandService;
    }

    @PostMapping("/createDemand")
    public Demand create(@RequestBody Demand demand)
    {
        return demandService.create(demand);
    }

    @PutMapping("/updateDemand")
    public Demand update(@RequestBody Demand demand)
    {
        return demandService.update(demand);
    }

    @DeleteMapping("/deleteDemandById/{id}")
    public void deleteById(@PathVariable Long id)
    {
        demandService.deleteById(id);
    }

    @GetMapping("/findDemandById/{id}")
    public Demand findById(@PathVariable Long id)
    {
        return demandService.findById(id);
    }

    @GetMapping("/findAllDemand")
    public List<Demand> findAll()
    {
        return demandService.findAll();
    }
}