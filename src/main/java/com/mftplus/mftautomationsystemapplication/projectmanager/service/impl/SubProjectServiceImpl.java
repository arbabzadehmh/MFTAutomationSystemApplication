package com.mftplus.mftautomationsystemapplication.projectmanager.service.impl;

import com.mftplus.mftautomationsystemapplication.projectmanager.model.SubProject;
import com.mftplus.mftautomationsystemapplication.projectmanager.repository.SubProjectRepository;
import com.mftplus.mftautomationsystemapplication.projectmanager.service.SubProjectService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubProjectServiceImpl implements SubProjectService {

    private final SubProjectRepository subProjectRepository;

    public SubProjectServiceImpl(SubProjectRepository subProjectRepository) {
        this.subProjectRepository = subProjectRepository;
    }

    @Override
    public void save(SubProject subProject) {
        subProjectRepository.save(subProject);
    }

    @Override
    public void update(SubProject subProject) {
        subProjectRepository.save(subProject);
    }

    @Override
    public void delete(Long id) {
        subProjectRepository.deleteById(id);
    }

    @Override
    public List<SubProject> findAll() {
        return subProjectRepository.findAll();
    }

    @Override
    public SubProject findById(Long id) {
        return subProjectRepository.findById(id).orElse(null);
    }
}
