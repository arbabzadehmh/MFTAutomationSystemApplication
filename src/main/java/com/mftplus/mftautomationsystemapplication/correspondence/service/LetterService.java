package com.mftplus.mftautomationsystemapplication.correspondence.service;

import com.mftplus.mftautomationsystemapplication.correspondence.model.Letter;

import java.util.List;

public interface LetterService {
    void save(Letter letter);
    void update(Letter letter);
    void delete(Long id);
    List<Letter> findAll();
    Letter findById(Long id);
}
