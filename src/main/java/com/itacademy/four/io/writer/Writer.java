package com.itacademy.four.io.writer;

/**
 * sustina postojanja ove metode je da nemetne standard klasam koje ce
 * netko pozvati
 *
 * u Javi 8 se pojavio functional Interface
 */
public interface Writer{

    void write(String path, String content) throws WriterException;

//    default void print(){
//        System.out.println("ispis..");
//    }
}
