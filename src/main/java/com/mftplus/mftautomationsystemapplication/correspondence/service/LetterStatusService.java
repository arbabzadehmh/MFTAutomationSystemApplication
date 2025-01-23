package com.mftplus.mftautomationsystemapplication.correspondence.service;

import com.mftplus.mftautomationsystemapplication.correspondence.model.LetterStatus;

import java.util.List;

public interface LetterStatusService {
    void save (LetterStatus letterStatus);
    void update (LetterStatus letterStatus);
    void delete (Long id);
    List<LetterStatus> findAll();
    LetterStatus findById(Long id);
}
