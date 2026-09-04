package com.itacademy.two;

/**
 * expected : line 1, line2, lin3 ...
 * EXCEPTION : error -> Java Exception

 Klasa: sustinaje postojanja klase je kreiranje varijabli ili objekata po sablonu te klase

 ArrayIndexOutOfBoundsException = new ArrayIndexOutOfBoundsException();
 -> kada se kreira po sablonu klase ArrayIndexOutOfBoundsException objekat znaci da se desila greska

 */
public class ExceptionDemo {
    public static void main(String[] args) {

        int [] numbers = new int[2];
        numbers[0] = 23;
        numbers[1] = 22;

        System.out.println(numbers[2]); // ovaj error je rezultat nase prgramerske greske
        //iako smo mi kreirali sintaksno ispravan program i kompajlirali program
        // u momentu kada smo pokrenuli program je pao. RUNTIME
        //RuntimeException
        System.out.println(numbers[0]);
    }
}
