package com.amir.sample.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author am.azizkhani on 2018-05-13.
 */
@Repository
public interface PersonRepo
        extends JpaRepository<PersonEnt, Long> {

    List<PersonEnt> findByLastName(String lastNameRegex);

    PersonEnt findByCode(String code);
}