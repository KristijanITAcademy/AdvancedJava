package com.itacademy.one.animal;

/**
 * kada objekt   posjeduje drugi objekt je kompozicija HAS A
 * Agregacija - objekt ima drugi objekt, ali taj objet moze postojati neovisno
 *
 *
 * Zna li ovaj simulator da postoji bird ili plane
 *
 * DEPENDENCY smo napravili. Zavisnost FlySimulatora postoji samo od Flyable
 */
public class FlySimulator {

    //PRINCIP : Depend upon abstraction(abstract class/interface not upon concrete implementation)
    // ovisnost od interfejsa
    //kompozicije je jednako zavisnost, zavisim od interfejsa ne od bird ili plane ,, tijesna veza
    //od zavisnosti ne mogu uteci
   private Flyable flyable;

    public FlySimulator(Flyable flyable) {
        this.flyable = flyable;
    }

    public void setFlyable(Flyable flyable) {
        this.flyable = flyable;
    }

    public void simulateFly(){
        this.flyable.fly();
    }
}
