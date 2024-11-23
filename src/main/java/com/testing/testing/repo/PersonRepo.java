package com.testing.testing.repo;

import com.testing.testing.entities.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepo extends JpaRepository<Person,Integer> {

    @Override
    boolean existsById(Integer id);
}
