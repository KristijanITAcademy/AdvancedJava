package com.itacademy.two.file;

import com.itacademy.two.exception.TextFileNotFoundException;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TextFileReader {
   private String name;



    public void setName(String name) {
        this.name = name;
    }

    public void readFile(String name) throws TextFileNotFoundException{
        File file = new File(name);
        if (!file.exists()){
            throw new TextFileNotFoundException("Fajl na putanji 's' ne postoji".formatted(name));
        }
        System.out.println("Fajl je pronaden i mozes poceti sa citanjem");

        try {
            Scanner scanner= new Scanner(file);
            while (scanner.hasNextLine()){
                String line = scanner.nextLine();
                System.out.println(line);
            }
        }catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }
    }
}
