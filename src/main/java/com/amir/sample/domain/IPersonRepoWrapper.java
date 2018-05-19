package com.amir.sample.domain;

import java.util.List;

/**
 * @author am.azizkhani on 2018-05-13.
 */
public interface IPersonRepoWrapper {

    List<PersonEnt> findByLastName(String regex);

    PersonEnt findByCode(String code);
}