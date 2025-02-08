package com.mftplus.mftautomationsystemapplication.correspondence.service.impl;

import com.mftplus.mftautomationsystemapplication.correspondence.model.LetterDetail;
import com.mftplus.mftautomationsystemapplication.correspondence.repository.LetterDetailRepository;
import com.mftplus.mftautomationsystemapplication.correspondence.service.LetterDetailService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
    @Transactional
    public void delete(Long id) {
        letterDetailRepository.softDelete(id);
    }

    @Override
    public List<LetterDetail> findAll() {
        return letterDetailRepository.findAllActive();
    }

    @Override
    public LetterDetail findById(Long id) {
        return letterDetailRepository.findActiveById(id).orElse(null);
    }
}
