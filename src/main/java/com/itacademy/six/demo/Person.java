package com.itacademy.six.demo;

import java.time.LocalDate;
import java.time.Period;

public class Person {
    private String name;
    private String surname;
    private Gender gender;
    private LocalDate birthday;

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

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }
    public int getAge(){
        LocalDate today = LocalDate.now();
        Period period = birthday.until(today);
        int age = period.getYears();
        return age;
    }
    @Override
    public String toString() {
        return name + " " + surname + ", " + gender + ", " + birthday;
    }
}
