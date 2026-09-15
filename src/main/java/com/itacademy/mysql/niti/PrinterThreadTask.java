package com.itacademy.mysql.niti;

import static java.lang.Thread.currentThread;


/**
 * ovo je drugi nacin
 * da smo ekstenzija klase Thred// nacin koji nije dobar
 */
public class PrinterThreadTask extends Thread {
    @Override
    public void run(){
        Thread currentThread = currentThread();
        String currentThreadName = currentThread().getName();
        System.out.println("printam neki tekst na printeru..To radim preko Threada " + currentThreadName);
    }
}
