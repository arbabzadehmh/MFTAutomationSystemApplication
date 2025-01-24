package com.mftplus.mftautomationsystemapplication.workflow.service;

import com.mftplus.mftautomationsystemapplication.workflow.exeption.ServiceException;
import com.mftplus.mftautomationsystemapplication.workflow.model.RequestPriority;

import java.util.List;

public interface RequestPriorityService
{
    RequestPriority create(RequestPriority priority) throws ServiceException;
    RequestPriority update(RequestPriority priority) throws ServiceException;
    void deleteById(Long id) throws ServiceException;
    RequestPriority findById(Long id) throws ServiceException;
    List<RequestPriority> findAll() throws ServiceException;
}