package com.itacademy.four.io.reader;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

/**
 * java.io.FileInputStream -> byte byte
 * java.io.ObjectInputStream
 *
 */
 class ObjectReader implements Reader{
    @Override
    public String read(String path) throws ReaderException {
      try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(path));){
         Object readed = ois.readObject();
         return readed.toString();
      }catch (Exception e){
          throw new ReaderException(e.getMessage());
      }
    }
}
