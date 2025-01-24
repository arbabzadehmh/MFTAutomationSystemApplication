package com.mftplus.mftautomationsystemapplication.workflow.service.impl;

import com.mftplus.mftautomationsystemapplication.workflow.model.RequestPriority;
import com.mftplus.mftautomationsystemapplication.workflow.repository.RequestPriorityRepository;
import com.mftplus.mftautomationsystemapplication.workflow.service.RequestPriorityService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RequestPriorityServiceImpl implements RequestPriorityService
{
    private final RequestPriorityRepository requestPriorityRepository;

    public RequestPriorityServiceImpl(RequestPriorityRepository requestPriorityRepository) {
        this.requestPriorityRepository = requestPriorityRepository;
    }

    @Override
    public RequestPriority create(RequestPriority priority) {
        return null;
    }

    @Override
    public RequestPriority update(RequestPriority priority) {
        return null;
    }

    @Override
    public void deleteById(Long id) {

    }

    @Override
    public RequestPriority findById(Long id) {
        return null;
    }

    @Override
    public List<RequestPriority> findAll() {
        return List.of();
    }
}