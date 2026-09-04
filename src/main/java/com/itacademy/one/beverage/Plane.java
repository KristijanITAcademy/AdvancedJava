package com.itacademy.one.beverage;

import com.itacademy.one.animal.Flyable;

public class Plane  implements Flyable {
    @Override
    public void fly() {
        System.out.println("I am plane and I am fly");
    }
}
