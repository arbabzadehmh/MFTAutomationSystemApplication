package com.mftplus.mftautomationsystemapplication.projectmanager.service.impl;

import com.mftplus.mftautomationsystemapplication.projectmanager.model.Project;
import com.mftplus.mftautomationsystemapplication.projectmanager.repository.ProjectRepository;
import com.mftplus.mftautomationsystemapplication.projectmanager.service.ProjectService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectServiceImpl implements ProjectService {

    private final ProjectRepository projectRepository;

    public ProjectServiceImpl(ProjectRepository projectRepository) {
        this.projectRepository = projectRepository;
    }

    @Override
    public void save(Project project) {
        projectRepository.save(project);
    }

    @Override
    public void update(Project project) {
        projectRepository.save(project);
    }

    @Override
    public void delete(Long id) {
        projectRepository.deleteById(id);
    }

    @Override
    public List<Project> findAll() {
        return projectRepository.findAll();
    }

    @Override
    public Project findById(Long id) {
        return projectRepository.findById(id).orElse(null);
    }
}
