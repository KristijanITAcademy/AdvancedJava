package com.itacademy.one.beverage;

import com.itacademy.one.animal.Flyable;

import java.awt.datatransfer.FlavorListener;

public class Helicopter implements Flyable {
    @Override
    public void fly() {
        System.out.println("I am helicopet and I am flying");
    }
}
