package com.amir.sample.controller;

import com.amir.sample.domain.IPersonRepoWrapper;
import com.amir.sample.domain.PersonEnt;
import com.amir.sample.service.ObjectConverter;
import com.amir.sample.service.PersonDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author am.azizkhani on 2018-05-13.
 */
@RestController
@RequestMapping("/main")
public class AccessPersonsController {

    private IPersonRepoWrapper personRepoWrapper;

    @Autowired
    AccessPersonsController(IPersonRepoWrapper personRepoWrapper) {
        this.personRepoWrapper = personRepoWrapper;
    }

    @GetMapping("/lName/{lastname}")
    public List<PersonDto> findPersons(@PathVariable String lastname) {
        final List<PersonEnt> personEnts = personRepoWrapper.findByLastName(lastname);

        return ObjectConverter
                .instance
                .getCloneObjectList(personEnts, PersonDto.class);
    }

    @GetMapping("/code/{code}")
    public PersonDto findPersonByCode(@PathVariable String code) {
        final PersonEnt personEnt = personRepoWrapper.findByCode(code);

        return ObjectConverter
                .instance
                .getCloneObject(personEnt, PersonDto.class);

    }
}