package com.itacademy.mysql.refleksija;

/**
 * jedna jedina  rekstrikcija je da enum MORA imati constructor private
 */

public enum Season {
    // ovo je public static field Season AUTUMN = new Season("Autumn");
    AUTUMN("Autumn"),
    WINTER("Winter"),
    SUMMER("Summer"),
    SPRING("Spring");

    private final String name;

    private Season(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
