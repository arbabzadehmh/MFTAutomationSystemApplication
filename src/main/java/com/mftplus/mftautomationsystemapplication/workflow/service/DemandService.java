package com.mftplus.mftautomationsystemapplication.workflow.service;

import com.mftplus.mftautomationsystemapplication.workflow.exeption.ServiceException;
import com.mftplus.mftautomationsystemapplication.workflow.model.Demand;

import java.util.List;

public interface DemandService
{
    Demand create(Demand demand) throws ServiceException;
    Demand update(Demand demand) throws ServiceException;
    void deleteById(Long id) throws ServiceException;
    Demand findById(Long id) throws ServiceException;
    List<Demand> findAll() throws ServiceException;
}