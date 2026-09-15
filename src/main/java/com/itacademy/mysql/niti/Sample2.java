package com.itacademy.mysql.niti;

import java.util.Arrays;
import java.util.List;

/**
 * -> broj threadova jednak je broju jezgri procesora
 */
public class Sample2 {
    public static void main(String[] args) {


        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 67, 78, 9, 4, 346, 32);
        //suma svih parnih brojeva brojeva

        int sum = 0;

//        for (int number : numbers) {
//            if (number % 2 == 0) {
//                sum += number;
//            }
//        }
//        System.out.println("Suma = " +sum);

        //problem s ovim gore je kad treba ubaciti thread


        //treba nam elegantan brz i tocan softver
        int suma = numbers
                .stream()
//                .parallel() MASTER
                .filter(n->n%2 ==0)
                .reduce(0,(x1,x2)-> x1 + x2);
        System.out.println("Suma - " + suma);


    }

    static int transform(int number){
        System.out.println("transformed by " + Thread.currentThread());
        return number;
    }
}
