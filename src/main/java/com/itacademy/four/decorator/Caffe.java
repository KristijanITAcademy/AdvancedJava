package com.itacademy.four.decorator;

public class Caffe implements Beverage{
    @Override
    public String name() {
        return "Kafa";
    }

    @Override
    public double cost() {
        return 2.2;
    }
}
