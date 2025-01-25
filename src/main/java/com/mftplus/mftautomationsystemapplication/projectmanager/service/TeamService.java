package com.mftplus.mftautomationsystemapplication.projectmanager.service;

import com.mftplus.mftautomationsystemapplication.projectmanager.model.Team;

import java.util.List;

public interface TeamService {
    void save(Team team);
    void update(Team team);
    void delete(Long id);
    List<Team> findAll();
    Team findById(Long id);
}
