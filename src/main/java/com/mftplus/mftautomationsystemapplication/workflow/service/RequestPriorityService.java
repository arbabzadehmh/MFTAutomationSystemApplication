package com.mftplus.mftautomationsystemapplication.workflow.service;

import com.mftplus.mftautomationsystemapplication.workflow.model.RequestPriority;

import java.util.List;

public interface RequestPriorityService
{
    RequestPriority create(RequestPriority priority);
    RequestPriority update(RequestPriority priority);
    void deleteById(Long id);
    RequestPriority findById(Long id);
    List<RequestPriority> findAll();
}