package com.itacademy.third.generic;

import java.time.LocalDate;

public class Person {
    private  String name;
    private String surname;
    private LocalDate localDate;

//    public Person(){}

    public Person(String name, String surname, LocalDate localDate) {
        this.name = name;
        this.surname = surname;
        this.localDate = localDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }
}
