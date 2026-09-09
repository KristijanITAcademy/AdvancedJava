package com.itacademy.seven;

import com.itacademy.six.demo.Person;
import com.itacademy.six.demo.PersonReader;

import java.util.List;

/**
 * Functional Programming VS OOP - i jedno i drugo je spoj boom
 *  - najbolja kombinacija
 *
 *  4 tipa metod referenciranja
 *      - static metoda
 *      - instancna metoda
 *      - constructor
 *      - type :: metod - referenca to an instance method kao da se radi o static metodi
 *      String:: toLowerCase
 *
 */
public class PersonDemo {
    public static void main(String[] args) {
        PersonReader personReader = new PersonReader();
        List<Person> personList = personReader.readPersons("persons.csv");
        //martin fowler fluent programming

        personList
                .stream()
                .filter(person -> person.getAge() > 18)
                .map(person -> person.getName() + " " + person.getSurname()+ " " + person.getBirthday())
                .forEach(System.out::println);
    }

}
