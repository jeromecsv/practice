package com.project.Practice.service;

import com.project.Practice.model.People;
import com.project.Practice.repository.PeopleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PeopleServiceImpl implements PeopleService{

    @Autowired
    private PeopleRepository peopleRepository;


    @Override
    public String getPeople() {
        Optional<People> people = peopleRepository.findById(1L);
        return people.get().getFirstName() + " " + people.get().getMiddleName() + " " + people.get().getLastName();
    }
}
