package com.mftplus.mftautomationsystemapplication.projectmanager.service;

import com.mftplus.mftautomationsystemapplication.projectmanager.model.Project;

import java.util.List;

public interface ProjectService {
    void save(Project project);
    void update(Project project);
    void delete(Long id);
    List<Project> findAll();
    Project findById(Long id);
}
