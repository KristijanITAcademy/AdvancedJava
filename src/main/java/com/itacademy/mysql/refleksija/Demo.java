package com.itacademy.mysql.refleksija;


import javax.crypto.SealedObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * U ovim pitanjima lezi razumijevanje svega
 *
 * Zasto kreiramo klasu ?
 * da bi kreirali konkretne instance/objekte/varijable po sablonu te klase, ali ne bilo kakve nego slozene
 *
 * Zasto koristimo enume umjesto klase?
 *  - kada ne zelimo beskonacno objekata/varijabli/instanci onda biramo umjesto klase enum
 *      - ogranicen broj, enumerirano, ima private constructor
 *
 * Kako da dizajniramo klasu i da po sablonu te klase kreiramo jedan jedini objekat?
 * SINGLETON - anti pattern
 *
 *
 */
public class Demo {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
//        Season season = new Season("autumn")
        Season season = Season.AUTUMN; // ovo mogu, referencaaaaaaa


        //ovdje se radi o tome da su svi na istoj memorijskoj lokacji
//        SpecialCreature singleton = SpecialCreature.getSINGLETON();
//        SpecialCreature singleton1 = SpecialCreature.getSINGLETON();
//        SpecialCreature specialCreature2 = SpecialCreature.getSINGLETON();
//        System.out.println(singleton1.hashCode());
//        System.out.println(singleton1.hashCode());
//        System.out.println(specialCreature2.hashCode());
//        System.out.println();

        System.out.println("Refleksija");

        /**
         * Za svaku klasu tako i za SpecialCreature JVM kreira po tocno jedan objekat, na nivou klase
         * . Moze klasa imati   mnostvo objekata kreiranih po sablonu ali samo jedan je
         * Class objekat
         */
        //JVM kreira svaki objekat .class
        Class<SpecialCreature> specialCreatureClass = SpecialCreature.class; // kreiran objekt
//        Class<?> specialCreatureClass1 = singleton1.getClass(); // kreiranje objekta
//        System.out.println(specialCreatureClass.hashCode());
        System.out.println(specialCreatureClass.hashCode()+"----> special creature");
        //Zasto je JVM kreirao za nas po svakoj klasi tocno jedan objekat tipa Class<T>?
        //field, method, constructor
        Constructor<SpecialCreature> specialCreatureConstructor = specialCreatureClass.getDeclaredConstructor();
        specialCreatureConstructor.setAccessible(true);
        SpecialCreature specialCreature2 = specialCreatureConstructor.newInstance();
        System.out.println(specialCreature2.hashCode()+ "-------->Special creature");
    }
}
