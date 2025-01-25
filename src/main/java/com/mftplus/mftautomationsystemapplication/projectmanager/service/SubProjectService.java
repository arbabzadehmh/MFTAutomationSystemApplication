package com.mftplus.mftautomationsystemapplication.projectmanager.service;

import com.mftplus.mftautomationsystemapplication.projectmanager.model.SubProject;

import java.util.List;

public interface SubProjectService {
    void save(SubProject subProject);
    void update(SubProject subProject);
    void delete(Long id);
    List<SubProject> findAll();
    SubProject findById(Long id);
}
