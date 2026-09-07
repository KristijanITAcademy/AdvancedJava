package com.itacademy.four.decorator;

/**
 * SOLID principal
 * Open/Close principle
 *  -> open for extend close for modification
 */
public class Tea implements Beverage{
    @Override
    public String name() {
        return "Tea";
    }

    @Override
    public double cost() {
        return 3;
    }
}
