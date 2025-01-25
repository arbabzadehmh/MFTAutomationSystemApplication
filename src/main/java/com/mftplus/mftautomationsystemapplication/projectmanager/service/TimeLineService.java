package com.mftplus.mftautomationsystemapplication.projectmanager.service;

import com.mftplus.mftautomationsystemapplication.projectmanager.model.TimeLine;

import java.util.List;

public interface TimeLineService {
    void save(TimeLine timeLine);
    void update(TimeLine timeLine);
    void delete(Long id);
    List<TimeLine> findAll();
    TimeLine findById(Long id);
}
