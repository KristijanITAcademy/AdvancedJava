package com.itacademy.one.animal;

/**
 * klasa kada inherit klasu -> extends
 * interface -> interface - extends/
 * klasa inherit interface -> implements
 */
public class Bird extends Animal implements Flyable{
    public Bird(String name) {
        super(name);
    }

    @Override
    public void playSound() {

    }

    @Override
    public void fly() {
        System.out.println("I am bird and I am fly");
    }
}
