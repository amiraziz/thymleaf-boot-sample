package com.amir.sample.domain;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author am.azizkhani on 2018-05-13.
 */
@Entity(name = "UAC_PERSON")
public class PersonEnt {

    @Id
    @Basic(optional = false)
    @Column(name = "UAC_PERS_ID")
    private Long   id;
    /**
     * family / name sherkat
     */
    @Column(name = "UAC_PERS_FIRSTNAME")
    private String firstName;
    @Column(name = "UAC_PERS_LASTNAME")
    private String lastName;
    @Column(name = "UAC_PERS_FATHERNAME")
    private String fatherName;
    @Column(name = "UAC_PERS_IDNO")
    private String code;

    public Long getId() {
        return id;
    }

    public PersonEnt setId(final Long id) {
        this.id = id;
        return this;
    }

    public String getCode() {
        return code;
    }

    public PersonEnt setCode(final String code) {
        this.code = code;
        return this;
    }

    public String getFirstName() {
        return firstName;
    }

    public PersonEnt setFirstName(final String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public PersonEnt setLastName(final String lastName) {
        this.lastName = lastName;
        return this;
    }

    public String getFatherName() {
        return fatherName;
    }

    public PersonEnt setFatherName(final String fatherName) {
        this.fatherName = fatherName;
        return this;
    }
}