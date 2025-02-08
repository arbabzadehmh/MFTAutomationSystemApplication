package com.mftplus.mftautomationsystemapplication.correspondence.service.impl;

import com.mftplus.mftautomationsystemapplication.correspondence.model.Referrals;
import com.mftplus.mftautomationsystemapplication.correspondence.repository.ReferralsRepository;
import com.mftplus.mftautomationsystemapplication.correspondence.service.ReferralsService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ReferralsServiceImpl implements ReferralsService {

    private final ReferralsRepository referralsRepository;

    public ReferralsServiceImpl(ReferralsRepository referralsRepository) {
        this.referralsRepository = referralsRepository;
    }

    @Override
    public void save(Referrals referrals) {
        referralsRepository.save(referrals);
    }

    @Override
    public void update(Referrals referrals) {
        referralsRepository.save(referrals);
    }

    @Override
    @Transactional
    public void delete(Long id) {
        referralsRepository.softDelete(id);
    }

    @Override
    public List<Referrals> findAll() {
        return referralsRepository.findAllActive();
    }

    @Override
    public Referrals findById(Long id) {
        return referralsRepository.findActiveById(id).orElse(null);
    }
}
