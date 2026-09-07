package com.itacademy.four.decorator;

public class MilkDecorator extends BeverageDecorator {

    public MilkDecorator(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String name() {
        return beverage.name() + " s mlijekom";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.8;
    }
}
