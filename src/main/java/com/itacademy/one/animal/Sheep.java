package com.itacademy.one.animal;

public class Sheep extends Animal {
    public Sheep(String name) {
        super(name);
    }


    @Override
    public void playSound() {
        System.out.println("be eeee ");
    }
}
