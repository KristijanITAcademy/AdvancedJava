package com.itacademy.two.file;

import com.itacademy.two.exception.TextFileNotFoundException;

import javax.swing.*;
import java.util.Scanner;

public class DemoFile {
    public static void main(String[] args) {
        System.out.println("Unesite ime fajla");
        Scanner console = new Scanner(System.in);
        String filePath = console.nextLine();

        TextFileReader textFileReader = new TextFileReader();
        try {
            System.out.println("pocinjemo sa citanjem fajla");
            textFileReader.readFile(filePath);
            System.out.println("nije se desio problem idemo dalje");
        } catch (TextFileNotFoundException exception){
            JOptionPane.showMessageDialog(null, exception.getMessage());
        }
        System.out.println("Program zavrsio");
    }
}
