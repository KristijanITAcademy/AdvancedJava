package com.itacademy.mysql.niti;

/**
 * Concurrency - > Thread/Niti
 * Vise radnika ne znaci brze zavrsen posao
 *
 * Problemi
 *  Thred interferencija
 *  Memory inkonzistencija
 *
 *  DeadLock - mrtva blokada - vjecna blokada
 *  LiveLock - kud jedan tud i drugi
 *  THREAD starvation - izgladnjivanje
 */
public class Demo {
    public static void main(String[] args) {
        //MAIN Thread : najmanje 1 Thread
        //izvrsio se neki Thread ili nit
        //Java Program se izvrsava: JRE i memory space
        // Radnik koji izvrsava linije koda
        String mainThreadName = Thread.currentThread().getName();
        System.out.println("Hej tko je izvrsio ovu liniju koda, odgovor je   ---> " + mainThreadName);


        //uvijek je uvjet da se pozove neka objetna tj instancna metoda da postoji objekat po sablonu te klase
        //1/ prvi nacin da neki kod izvrsite u drugom Thread/Niti
        Runnable printTask = new PrintTask();
//        printTask.run();

        // ovako pozivamo ako zelimo da neki drugi thread izvrsi tu liniju koda
        Thread thread = new Thread(printTask);
        thread.start();
        System.out.println();


    }

}
