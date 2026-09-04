package com.itacademy.third.io;

import java.io.*;

/**
 * citanje fajla: java.io.FileInputStream
 * Pisanje u fajl: java.io.FileOutputStream
 *
 * <p>
 *      Exception <- IOEception <- FileNotFoundException
 * </p>
 *
 * try - with - resource
 * Java pozove u pozadini
 */
public class CopyByteDemo {
    public static void main(String[] args) {
        try(FileInputStream fileInputStream = new FileInputStream("data.txt");
            FileOutputStream fileOutputStream = new FileOutputStream("output.txt")){
            int c;

         while ((c = fileInputStream.read()) != - 1){
             fileOutputStream.write(c);
         }
//                System.out.println(c + (char)c);
//            }

        }catch (IOException e){
            System.err.println(e.getMessage());
        }
    }
}
