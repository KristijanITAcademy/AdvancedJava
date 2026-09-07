package com.itacademy.four.io.writer;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

 class ObjectWriter implements Writer {

    public void write(String path, Object object) throws WriterException {
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(path))) {
           objectOutputStream.writeObject(object);
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }

     @Override
     public void write(String path, String content) throws WriterException {

     }
 }
