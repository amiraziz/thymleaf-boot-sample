package com.amir.sample.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author am.azizkhani on 2018-05-13.
 */
@Service
public class PersonRepoWrapper
        implements IPersonRepoWrapper {

    private PersonRepo personRepo;

    @Autowired
    PersonRepoWrapper(PersonRepo personRepo) {
        this.personRepo = personRepo;
    }

    @Override
    public List<PersonEnt> findByLastName(String lastName) {
        return personRepo.findByLastName(lastName);
    }

    @Override
    public PersonEnt findByCode(final String code) {
        return personRepo.findByCode(code);
    }
}
