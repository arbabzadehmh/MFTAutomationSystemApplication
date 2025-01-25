package com.mftplus.mftautomationsystemapplication.projectmanager.service.impl;

import com.mftplus.mftautomationsystemapplication.projectmanager.model.TimeLine;
import com.mftplus.mftautomationsystemapplication.projectmanager.repository.TimeLineRepository;
import com.mftplus.mftautomationsystemapplication.projectmanager.service.TimeLineService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TimeLineServiceImpl implements TimeLineService {

    private final TimeLineRepository timeLineRepository;

    public TimeLineServiceImpl(TimeLineRepository timeLineRepository) {
        this.timeLineRepository = timeLineRepository;
    }

    @Override
    public void save(TimeLine timeLine) {
        timeLineRepository.save(timeLine);
    }

    @Override
    public void update(TimeLine timeLine) {
        timeLineRepository.save(timeLine);
    }

    @Override
    public void delete(Long id) {
        timeLineRepository.deleteById(id);
    }

    @Override
    public List<TimeLine> findAll() {
        return timeLineRepository.findAll();
    }

    @Override
    public TimeLine findById(Long id) {
        return timeLineRepository.findById(id).orElse(null);
    }
}
