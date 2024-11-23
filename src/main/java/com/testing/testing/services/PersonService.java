package com.testing.testing.services;

import com.testing.testing.entities.Person;
import com.testing.testing.repo.PersonRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {


    private final PersonRepo personRepo;

    public PersonService(PersonRepo personRepo) {
        this.personRepo = personRepo;
    }

    public List<Person> getAllPerson(){
        return personRepo.findAll();
    }
}
