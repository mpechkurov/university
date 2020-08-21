package com.example.university.domain;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Person {

    @Column
    private String firstNamel;

    @Column
    private String lastName;

    public Person(String firstNamel, String lastName) {
        this.firstNamel = firstNamel;
        this.lastName = lastName;
    }

    protected Person() {
    }

    public String getFirstNamel() {
        return firstNamel;
    }

    public void setFirstNamel(String firstNamel) {
        this.firstNamel = firstNamel;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Person{" +
               "firstNamel='" + firstNamel + '\'' +
               ", lastName='" + lastName + '\'' +
               '}';
    }
}
