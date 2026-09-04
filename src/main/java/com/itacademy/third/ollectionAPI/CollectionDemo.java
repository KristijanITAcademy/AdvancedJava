package com.itacademy.third.ollectionAPI;

import com.itacademy.third.generic.Person;

import java.util.*;

/**
 * 1. OOP - inheritance, polymorphism, abstraction(inteface, abstract class), encapsulation
 * 2. GENERIC type
 * Parametrizirano znaci ne znamo unaprijed kojeg su tipa sve dok ne instanciramo
 *
 * <p>
 *     Nizovi - fiksne duzine, svi moraju biti istog tipa
 * </p>
 *
 * Kolkcije su dinamicni tipovi, nisu zapravo nista drugo doli klase
 */
public class CollectionDemo {
    public static void main(String[] args) {


//     Person person = new Person();// SIROVI SLOZEN TIP
        //kolekcija je interface
        //nameCollection je tipa - > HashSet, Set, Collection, poliforfistican, visetipan
        HashSet<String> namesCollection = new HashSet<>();

        //listNames tipa je ArrayList, List, SequenceCollection, Collection, Iterable
        List<String> listNames = new ArrayList<>();
        listNames.add("Stipe");
        listNames.add("Marko");
        listNames.add("Elmir");
        listNames.add("Kiko");
        listNames.add("Kiko");
//        for (int i = 0; i <listNames.size() ; i++) {
//            String element = listNames.get(i);
//            System.out.println(element);

        printCollection(listNames);
//        }

        //ENHANCED FOR LOOP prima objekat tipa Iterable
//        CustomCollection collection = new CustomCollection();
//        for (Person per : collection){
//            System.out.println(per);
//        }
        System.out.println();
        Set<String> setOfNames = new HashSet<>();
        setOfNames.add("Stipe");
        setOfNames.add("Marko");
        setOfNames.add("Elmir");
        setOfNames.add("Kiko");
        setOfNames.add("Kiko");
//        for (String e : setOfNames){
//            System.out.println(e);


        System.out.println();
        printCollection(setOfNames);
        System.out.println();
        Set<String> setOfNames2 = new LinkedHashSet<>();
        setOfNames2.add("Stipe");
        setOfNames2.add("Marko");
        setOfNames2.add("Elmir");
        setOfNames2.add("Kiko");
        setOfNames2.add("Kiko");
        printCollection(setOfNames2);
    }
    //moguce je koristit ovu petlju, ovaj loop sto sve kolekcije implementiraju iterable


    static void printCollection(Iterable<String> stringCollection) {
        for (String s : stringCollection) {
            System.out.println(s);
        }
    }
}
