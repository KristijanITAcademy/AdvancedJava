package com.itacademy.mysql.niti;

import java.util.Arrays;
import java.util.List;

/**
 * Brian Goetz : Concurrency In Practice
 * 2 vrste zahtjevnih operacija funkcija/metoda
 * IO intensive operacije
 * computational intensive
 *
 * intencija threadova - da sto brze se prode sto brzi izvrsi
 * najbolji je onaj koji radi brzo i daje tocan rezultat
 *
 * Core (8 jezgri procesora)
 *
 * NUMBER oF THREAD = ---------------------
 *      2 - BLOCKING_FACTOR <1 i 0>
 *
 *
 */
public class Sample {
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
}