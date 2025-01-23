package com.mftplus.mftautomationsystemapplication.correspondence.service.impl;

import com.mftplus.mftautomationsystemapplication.correspondence.model.LetterDetail;
import com.mftplus.mftautomationsystemapplication.correspondence.repository.LetterDetailRepository;
import com.mftplus.mftautomationsystemapplication.correspondence.service.LetterDetailService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LetterDetailServiceImpl implements LetterDetailService {

    private final LetterDetailRepository letterDetailRepository;

    public LetterDetailServiceImpl(LetterDetailRepository letterDetailRepository) {
        this.letterDetailRepository = letterDetailRepository;
    }

    @Override
    public void save(LetterDetail letterDetail) {
        letterDetailRepository.save(letterDetail);
    }

    @Override
    public void update(LetterDetail letterDetail) {
        letterDetailRepository.save(letterDetail);
    }

    @Override
    public void delete(Long id) {
        letterDetailRepository.deleteById(id);
    }

    @Override
    public List<LetterDetail> findAll() {
        return letterDetailRepository.findAll();
    }

    @Override
    public LetterDetail findById(Long id) {
        return letterDetailRepository.findById(id).orElse(null);
    }
}
