package com.mftplus.mftautomationsystemapplication.correspondence.service;

import com.mftplus.mftautomationsystemapplication.correspondence.model.Referrals;

import java.util.List;

public interface ReferralsService {
    void save(Referrals referrals);
    void update(Referrals referrals);
    void delete(Long id);
    List<Referrals> findAll();
    Referrals findById(Long id);
}
