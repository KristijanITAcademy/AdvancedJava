package com.itacademy.one;


import com.itacademy.one.animal.Bird;
import com.itacademy.one.animal.Cow;
import com.itacademy.one.animal.FlySimulator;
import com.itacademy.one.animal.Sheep;
import com.itacademy.one.beverage.Helicopter;
import com.itacademy.one.beverage.Plane;
import com.itacademy.one.human.Persona;

public class Demo {
    public static void main(String[] args) {

        Bird bird = new Bird("papko");
        Plane plane = new Plane();
        Helicopter helicopter = new Helicopter();
        Sheep sheep = new Sheep("Ciciko");
        Cow cow = new Cow("Bila");
        Persona persona = new Persona();

        //Strategy Pattern
        FlySimulator flySimulator = new FlySimulator(bird);
        flySimulator.simulateFly();
        flySimulator.setFlyable(plane);
        flySimulator.simulateFly();
        flySimulator.setFlyable(helicopter);
        flySimulator.simulateFly();

        System.out.println();
        persona.setAnimal(sheep);
        persona.makeAnimal();
        persona.setAnimal(cow);

    }
}
