package com.itacademy.mysql.refleksija;

/**
 * enum vs klasa
 *  - method - nema razlike
 *  - field - nema razlike
 *  - constructor - ovdje postoji ralika, enum insistira private constructor, a klasa,
 *  private/package-private/protected/public
 *  - moze i konstruktor klase biti private
 *  - nested klase/inner class
 *      - static
 *      - non-static
 *      , a klasa istog imena kao i fajl je outer class
 *
 */
public class SpecialCreature {
    // konvencija = ako imas static field koristi velika slova prilikom imenovanja
     private static SpecialCreature SINGLETON;

     private SpecialCreature(){
         System.out.println("Poziv konstruktora za SINGLETON");
     }

    public static SpecialCreature getSINGLETON() {
         if (SINGLETON == null){
             SINGLETON = new SpecialCreature();
         }
        return SINGLETON;
    }
}
