package com.mftplus.mftautomationsystemapplication.correspondence.service.impl;

import com.mftplus.mftautomationsystemapplication.correspondence.model.Paraph;
import com.mftplus.mftautomationsystemapplication.correspondence.repository.ParaphRepository;
import com.mftplus.mftautomationsystemapplication.correspondence.service.ParaphService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ParaphServiceImpl implements ParaphService {

    private final ParaphRepository paraphRepository;

    public ParaphServiceImpl(ParaphRepository paraphRepository) {
        this.paraphRepository = paraphRepository;
    }

    @Override
    public void save(Paraph paraph) {
        paraphRepository.save(paraph);
    }

    @Override
    public void update(Paraph paraph) {
        paraphRepository.save(paraph);
    }

    @Override
    @Transactional
    public void delete(Long id) {
        paraphRepository.softDelete(id);
    }

    @Override
    public List<Paraph> findAll() {
        return paraphRepository.findAllActive();
    }

    @Override
    public Paraph findById(Long id) {
        return paraphRepository.findActiveById(id).orElse(null);
    }
}
