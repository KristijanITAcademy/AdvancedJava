package com.itacademy.mysql.niti;

import static java.lang.Thread.currentThread;

public class PrintTask implements Runnable {
    @Override
    public void run(){
        Thread currentThread = currentThread();
        String currentThreadName = currentThread().getName();
        System.out.println("printam neki tekst na printeru..To radim preko Threada " + currentThreadName);
    }
}
