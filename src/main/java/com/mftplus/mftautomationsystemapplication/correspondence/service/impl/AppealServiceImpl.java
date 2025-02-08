package com.mftplus.mftautomationsystemapplication.correspondence.service.impl;

import com.mftplus.mftautomationsystemapplication.correspondence.model.Appeal;
import com.mftplus.mftautomationsystemapplication.correspondence.repository.AppealRepository;
import com.mftplus.mftautomationsystemapplication.correspondence.service.AppealService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class AppealServiceImpl implements AppealService {

    private final AppealRepository appealRepository;

    public AppealServiceImpl(AppealRepository appealRepository) {
        this.appealRepository = appealRepository;
    }

    @Override
    public void save(Appeal appeal) {
        appealRepository.save(appeal);
    }

    @Override
    public void update(Appeal appeal) {
        appealRepository.save(appeal);
    }

    @Override
    @Transactional
    public void delete(Long id) {
        appealRepository.softDelete(id);
    }

    @Override
    public List<Appeal> findAll() {
        return appealRepository.findAllActive();
    }

    @Override
    public Appeal findById(Long id) {
        return appealRepository.findActiveById(id).orElse(null);
    }


}
