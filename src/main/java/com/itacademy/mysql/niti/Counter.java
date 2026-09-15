package com.itacademy.mysql.niti;

/**
 * Thread interferencija
 *
 * Samo sa jednim thread kada zelimo promjenit vrijendost varijable c koji su koraci;
 *  1. iz memorije dohvatit trenutnu vrijednos c 0
 *  2. uraditi neku operaciju c ++ 1
 *  3. vratiti u memoriju izmjenjenu vrijendost c 1
 *
 *  //Thread A & Thread B
 *  Thread A dohvati 0
 *  Thread B dohvati 0
 *  Thread A : c++ sa 0 na 1
 *  Thread B: c++ sa 0 na -1
 *
 *  Thread A vratiti c = 1
 *  Thread B vratiti c = -1
 *  Dzaba si radio poso -- ovo je problem sa threadovima, krivi rezultato
 */
public class Counter {

    private int c = 0;
    private void incremnet(){
        c++;
    }
    public void decrement(){
        c--;
    }
    public int value(){
        return c;
    }
}
