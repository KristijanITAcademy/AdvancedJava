package com.itacademy.four.decorator;

/**
 * Modifikatori:
 * public
 * private -> vidi samo gdje je field declarate
 * paketno privatno  -> bez keyword -> vidi samo klasa gdje je polje declarate i klase u istom paketu
 * protected -> eksteznija paketno privatne vidljivosti..isto package private ali vide i klase
 * koje su u istom paketu i klase koje mozda nisu u istom paketu ali nasljeduju klasu npt. bevreragedecorator
 *
 * relacije medu klasaa
 * nasljedivanje i kompozicija
 *
 *
 * sa protected klasa pusta sve klase koje je nasljeduju direktan pristup polju
 * vidljivo je samo unutar klasa koje je nasljeduju
 *
 */
public abstract class BeverageDecorator implements  Beverage{

    //Depend upon abstractuon not upon concrete implementation
    //protected final Tea
    //protected final Caffe
    // nisam se zakljuca samo na caj ii samo na kafu, nego na pice, ono sto moze imati i jedno i drugo

    protected final   Beverage beverage;

    public BeverageDecorator(Beverage beverage){
        this.beverage = beverage;
    }

    public Beverage getBeverage() {
        return beverage;
    }
}
