package com.itacademy.one.animal;

/**
 *ne tjeraj klase da implementira metodu koju ne koristi
 * narusen princip Segregation Interface
 * Functional Interface - jedna i samo jedna abstract method
 * Bolje imati vise interface
 */
public abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    //

    public abstract void playSound();

    public void setName(String name) {
        this.name = name;
    }


}
