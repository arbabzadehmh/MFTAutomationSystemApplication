package com.mftplus.mftautomationsystemapplication.correspondence.service.impl;

import com.mftplus.mftautomationsystemapplication.correspondence.model.LetterStatus;
import com.mftplus.mftautomationsystemapplication.correspondence.repository.LetterStatusRepository;
import com.mftplus.mftautomationsystemapplication.correspondence.service.LetterStatusService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LetterStatusServiceImpl implements LetterStatusService {

    private final LetterStatusRepository letterStatusRepository;

    public LetterStatusServiceImpl(LetterStatusRepository letterStatusRepository) {
        this.letterStatusRepository = letterStatusRepository;
    }

    @Override
    public void save(LetterStatus letterStatus) {
        letterStatusRepository.save(letterStatus);
    }

    @Override
    public void update(LetterStatus letterStatus) {
        letterStatusRepository.save(letterStatus);
    }

    @Override
    public void delete(Long id) {
        letterStatusRepository.deleteById(id);
    }

    @Override
    public List<LetterStatus> findAll() {
        return letterStatusRepository.findAll();
    }

    @Override
    public LetterStatus findById(Long id) {
        return letterStatusRepository.findById(id).orElse(null);
    }
}
