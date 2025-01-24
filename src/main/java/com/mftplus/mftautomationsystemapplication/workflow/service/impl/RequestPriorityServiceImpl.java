package com.mftplus.mftautomationsystemapplication.workflow.service.impl;

import com.mftplus.mftautomationsystemapplication.workflow.exeption.ServiceException;
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
    public RequestPriority create(RequestPriority priority) throws ServiceException {
        return null;
    }

    @Override
    public RequestPriority update(RequestPriority priority) throws ServiceException{
        return null;
    }

    @Override
    public void deleteById(Long id) throws ServiceException{

    }

    @Override
    public RequestPriority findById(Long id) throws ServiceException{
        return null;
    }

    @Override
    public List<RequestPriority> findAll() throws ServiceException{
        return List.of();
    }
}