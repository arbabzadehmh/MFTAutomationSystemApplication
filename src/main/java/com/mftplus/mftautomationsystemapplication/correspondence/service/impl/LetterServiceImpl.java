package com.mftplus.mftautomationsystemapplication.correspondence.service.impl;

import com.mftplus.mftautomationsystemapplication.correspondence.model.Letter;
import com.mftplus.mftautomationsystemapplication.correspondence.repository.LetterRepository;
import com.mftplus.mftautomationsystemapplication.correspondence.service.LetterService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LetterServiceImpl implements LetterService {

    private final LetterRepository letterRepository;

    public LetterServiceImpl(LetterRepository letterRepository) {
        this.letterRepository = letterRepository;
    }

    @Override
    public void save(Letter letter) {
        letterRepository.save(letter);
    }

    @Override
    public void update(Letter letter) {
        letterRepository.save(letter);
    }

    @Override
    public void delete(Long id) {
        letterRepository.deleteById(id);
    }

    @Override
    public List<Letter> findAll() {
        return letterRepository.findAll();
    }

    @Override
    public Letter findById(Long id) {
        return letterRepository.findById(id).orElse(null);
    }
}
