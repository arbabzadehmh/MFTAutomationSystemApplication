package com.mftplus.mftautomationsystemapplication.correspondence.service;

import com.mftplus.mftautomationsystemapplication.correspondence.model.LetterPriority;

import java.util.List;

public interface LetterPriorityService {
    void save (LetterPriority letterPriority);
    void update (LetterPriority letterPriority);
    void delete (Long id);
    List<LetterPriority> findAll();
    LetterPriority findById(Long id);
}
