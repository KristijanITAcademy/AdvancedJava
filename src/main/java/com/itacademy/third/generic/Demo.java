package com.itacademy.third.generic;


import java.time.LocalDate;

/**
 * Prosti/ugradeni
 * slozeni/objektni
 *  -> podgrupa 1 - sirove slozene / RAW type
 *  -> podgrupa2 - parametrizirane slozene tipove podataka(genericnim tipovima)
 *
 * Zasto su uvedeni omotaci prostih tipova ?
 *  -> kako bi se mogla koristiti u parametrizaciji genericnih tipova
 *
 *  Dvijr grupe genericnih tipova"
 *  <>\bounded</>
 *  <>unbounded</>
 */
public class Demo {
    public static void main(String[] args) {

        int number  = 23;
        Person person = new Person("Kristijan", "Birkic", LocalDate.now());
        person.setSurname("Meric");

        //box objekat je TIPA Box, ali je parameriziran sa String i Integer(njegova polja su tog tipa)
        Box<String, Integer> boxObjekat = new Box();
        //number je tipa Box parametriziran je sa Double Integer
        Box<Double, Integer> numberObjekat = new Box<>();
        numberObjekat.setField(22.0);
        numberObjekat.setElement(23);

        CustomNumber customNumber = new CustomNumber();
        NumberBox<CustomNumber> numberBox = new NumberBox<>();

        //ne mogu parametrizirati sa primitivnim tipovima
        // za to postoje wrapperi odnosno omotaci, i tu se desava boxing i unboxing
            Integer slozenaVarijbla = 23; //boxing
            int prostaVarijabla = slozenaVarijbla; //unboxing

    }
}
