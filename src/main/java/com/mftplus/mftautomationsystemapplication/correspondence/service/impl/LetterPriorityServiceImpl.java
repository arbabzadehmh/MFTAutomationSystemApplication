package com.mftplus.mftautomationsystemapplication.correspondence.service.impl;

import com.mftplus.mftautomationsystemapplication.correspondence.model.LetterPriority;
import com.mftplus.mftautomationsystemapplication.correspondence.repository.LetterPriorityRepository;
import com.mftplus.mftautomationsystemapplication.correspondence.service.LetterPriorityService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class LetterPriorityServiceImpl implements LetterPriorityService {

    private final LetterPriorityRepository letterPriorityRepository;

    public LetterPriorityServiceImpl(LetterPriorityRepository letterPriorityRepository) {
        this.letterPriorityRepository = letterPriorityRepository;
    }

    @Override
    public void save(LetterPriority letterPriority) {
        letterPriorityRepository.save(letterPriority);
    }

    @Override
    public void update(LetterPriority letterPriority) {
        letterPriorityRepository.save(letterPriority);
    }

    @Override
    @Transactional
    public void delete(Long id) {
        letterPriorityRepository.softDelete(id);
    }

    @Override
    public List<LetterPriority> findAll() {
        return letterPriorityRepository.findAllActive();
    }

    @Override
    public LetterPriority findById(Long id) {
        return letterPriorityRepository.findActiveById(id).orElse(null);
    }
}
