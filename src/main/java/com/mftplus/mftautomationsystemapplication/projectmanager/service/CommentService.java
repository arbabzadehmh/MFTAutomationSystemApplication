package com.mftplus.mftautomationsystemapplication.projectmanager.service;

import com.mftplus.mftautomationsystemapplication.projectmanager.model.Comment;

import java.util.List;

public interface CommentService {
    void save(Comment comment);
    void update(Comment comment);
    void delete(Long id);
    List<Comment> findAll();
    Comment findById(Long id);
}
