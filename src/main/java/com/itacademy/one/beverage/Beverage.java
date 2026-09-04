package com.itacademy.one.beverage;

/**
 TIP VARIJABLA = VRIJEDOST  - cijelo programiranje pociva na ovome

 Sustina klase je instanciranje objekata
 Abstract sluzi da nametne pattern ponasnja

 MI KLASOM DIZAJNIRAMO VLASTITI TIP PODATKA
 */
public abstract class Beverage {

    private String name;

    public Beverage(String name) {
        this.name = name;
    }

    public  abstract void cost();

    public String getName() {
        return name;
    }
}
