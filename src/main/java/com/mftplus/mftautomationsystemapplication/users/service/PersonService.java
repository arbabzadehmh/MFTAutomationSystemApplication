package com.mftplus.mftautomationsystemapplication.users.service;

import com.mftplus.mftautomationsystemapplication.users.model.Person;

import java.util.List;

public interface PersonService {
    void save(Person person);
    void update(Person person);
    void delete(long id);
    List<Person> findAll();
    Person findById(long id);
}
