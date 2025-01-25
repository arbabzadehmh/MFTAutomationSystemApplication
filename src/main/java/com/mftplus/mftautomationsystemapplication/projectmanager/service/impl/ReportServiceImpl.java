package com.mftplus.mftautomationsystemapplication.projectmanager.service.impl;

import com.mftplus.mftautomationsystemapplication.projectmanager.model.Report;
import com.mftplus.mftautomationsystemapplication.projectmanager.repository.ReportRepository;
import com.mftplus.mftautomationsystemapplication.projectmanager.service.ReportService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReportServiceImpl implements ReportService {

    private final ReportRepository reportRepository;

    public ReportServiceImpl(ReportRepository reportRepository) {
        this.reportRepository = reportRepository;
    }

    @Override
    public void save(Report report) {
        reportRepository.save(report);
    }

    @Override
    public void update(Report report) {
        reportRepository.save(report);
    }

    @Override
    public void delete(Long id) {
        reportRepository.deleteById(id);
    }

    @Override
    public List<Report> findAll() {
        return reportRepository.findAll();
    }

    @Override
    public Report findById(Long id) {
        return reportRepository.findById(id).orElse(null);
    }
}
