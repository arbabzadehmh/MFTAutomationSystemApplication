package com.mftplus.mftautomationsystemapplication.correspondence.service;

import com.mftplus.mftautomationsystemapplication.correspondence.model.Paraph;

import java.util.List;

public interface ParaphService {
    void save(Paraph paraph);
    void update(Paraph paraph);
    void delete(Long id);
    List<Paraph> findAll();
    Paraph findById(Long id);
}
