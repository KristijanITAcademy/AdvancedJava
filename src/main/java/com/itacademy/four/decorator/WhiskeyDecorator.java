package com.itacademy.four.decorator;

public class WhiskeyDecorator extends BeverageDecorator{
    public WhiskeyDecorator(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String name() {
        return beverage.name() + " i whiskey";
    }

    @Override
    public double cost() {
        return beverage.cost() + 2.5;
    }
}
