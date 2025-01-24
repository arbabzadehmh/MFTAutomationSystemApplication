package com.mftplus.mftautomationsystemapplication.workflow.controller;

import com.mftplus.mftautomationsystemapplication.workflow.exeption.ServiceException;
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
    public Demand create(@RequestBody Demand demand) throws ServiceException
    {
        return demandService.create(demand);
    }

    @PutMapping("/updateDemand")
    public Demand update(@RequestBody Demand demand) throws ServiceException
    {
        return demandService.update(demand);
    }

    @DeleteMapping("/deleteDemandById/{id}")
    public void deleteById(@PathVariable Long id) throws ServiceException
    {
        demandService.deleteById(id);
    }

    @GetMapping("/findDemandById/{id}")
    public Demand findById(@PathVariable Long id) throws ServiceException
    {
        return demandService.findById(id);
    }

    @GetMapping("/findAllDemand")
    public List<Demand> findAll() throws ServiceException
    {
        return demandService.findAll();
    }
}