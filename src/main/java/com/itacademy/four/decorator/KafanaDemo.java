package com.itacademy.four.decorator;

public class KafanaDemo {
    public static void main(String[] args) {

        Caffe caffe = new Caffe();
        consume(caffe);

        Tea tea = new Tea();
        consume(tea);

        Beverage beverage = new MilkDecorator(new Caffe());
        consume(beverage);

        Beverage beverage1 = new WhiskeyDecorator(new Tea());
        consume(beverage1);
    }

    static  void  consume (Beverage beverage){
        System.out.println(beverage.name() + " kosta " + beverage.cost());
    }
}
