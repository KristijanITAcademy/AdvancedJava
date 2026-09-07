package com.itacademy.five;

import com.itacademy.four.io.writer.*;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * u Javi 8 kada dode do kreiranja objekata TIPA functional interface onda je zamjena za operator
 * new LAMBDA operator (  -> )
 */
public class ConsumerWriterDemo {
    public static void main(String[] args) {

        Writer pisac = (putanjaDoFajla, sadrzaj)->{
            try (FileWriter fileWriter = new FileWriter(putanjaDoFajla)){
                fileWriter.write(sadrzaj);
            }catch (IOException e){
                System.err.println(e.getMessage());
            }
        };


        Writer writer2 = (f,c)->piseSadrzajKaFajlu(f,c);


        Writer writer = WriterType.LINE.getWriter();
        WriterExecutor writerExecutor = new WriterExecutor(writer);
        writerExecutor.executeWriter("novifajl.txt","Ovo je lako za razumijeti, samo malo cupa zivce");
    }

    private static   void piseSadrzajKaFajlu(String filePath, String fileContent){
        try (FileWriter fileWriter = new FileWriter(filePath)){
            fileWriter.write(fileContent);
        }catch (IOException e){
            System.err.println(e.getMessage());
        }
    }
}
