package com.testing.testing.services;

import com.testing.testing.entities.Person;
import com.testing.testing.repo.PersonRepo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;


import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.BDDMockito.given;

@ExtendWith(MockitoExtension.class)
public class PersonServiceTest {

    @Mock
    private PersonRepo personRepo;

    @InjectMocks
    private PersonService personService;

    @Test
    void getAllPerson(){
        //given
     //   Person person = new Person(1,"Ahnis","Gotham");
    //    Person person2 = new Person(2,"Saksham","New york");
        //when
    //    given(personRepo.findAll()).willReturn(List.of(person,person2));

        var allPerson = personService.getAllPerson();

        //Then make sure to import assertThat from org.assertj.core.api package
        assertThat(allPerson).isNotNull();

        assertThat(allPerson.size()).isEqualTo(2);
    }
}
