package com.mftplus.mftautomationsystemapplication.projectmanager.service;

import com.mftplus.mftautomationsystemapplication.projectmanager.model.Task;

import java.util.List;

public interface TaskService {
    void save(Task task);
    void update(Task task);
    void delete(Long id);
    List<Task> findAll();
    Task findById(Long id);
}
