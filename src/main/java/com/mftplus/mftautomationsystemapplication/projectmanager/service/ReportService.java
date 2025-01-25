package com.mftplus.mftautomationsystemapplication.projectmanager.service;

import com.mftplus.mftautomationsystemapplication.projectmanager.model.Budget;
import com.mftplus.mftautomationsystemapplication.projectmanager.model.Report;

import java.util.List;

public interface ReportService {
    void save(Report report);
    void update(Report report);
    void delete(Long id);
    List<Report> findAll();
    Report findById(Long id);
}
