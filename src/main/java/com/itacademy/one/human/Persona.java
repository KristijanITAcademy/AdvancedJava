package com.itacademy.one.human;

import com.itacademy.one.animal.Animal;
import com.itacademy.one.animal.Bird;

public class Persona {

    private String name;
    // Animal je abstract klasa -> kompozicija je zavisnost od apstraktne klase = slaba veza (dobro)
    private Animal animal;

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public void makeAnimal(){
        animal.playSound();
    }
    // OVO JE TIJESNA VEZA JAAAKO TIJESNA, JER OVIM PERSON MOZE IMATI SAMO BIRD, time mijenjam kod, dodavam
    //nije dobro
//    private Bird bird;
//
//    public void setBird(Bird bird) {
//        this.bird = bird;
//    }
}
