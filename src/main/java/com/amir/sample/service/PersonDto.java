package com.amir.sample.service;

/**
 * @author am.azizkhani on 2018-05-13.
 */
public class PersonDto {

    private Long   id;
    /**
     * family / name sherkat
     */
    private String firstName;
    private String lastName;
    private String fatherName;

    public Long getId() {
        return id;
    }

    public PersonDto setId(final Long id) {
        this.id = id;
        return this;
    }

    public String getFirstName() {
        return firstName;
    }

    public PersonDto setFirstName(final String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public PersonDto setLastName(final String lastName) {
        this.lastName = lastName;
        return this;
    }

    public String getFatherName() {
        return fatherName;
    }

    public PersonDto setFatherName(final String fatherName) {
        this.fatherName = fatherName;
        return this;
    }
}