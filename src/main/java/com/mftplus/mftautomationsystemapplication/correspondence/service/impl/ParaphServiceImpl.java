package com.mftplus.mftautomationsystemapplication.correspondence.service.impl;

import com.mftplus.mftautomationsystemapplication.correspondence.model.Paraph;
import com.mftplus.mftautomationsystemapplication.correspondence.repository.ParaphRepository;
import com.mftplus.mftautomationsystemapplication.correspondence.service.ParaphService;
import org.springframework.stereotype.Service;

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
    public void delete(Long id) {
        paraphRepository.deleteById(id);
    }

    @Override
    public List<Paraph> findAll() {
        return paraphRepository.findAll();
    }

    @Override
    public Paraph findById(Long id) {
        return paraphRepository.findById(id).orElse(null);
    }
}
