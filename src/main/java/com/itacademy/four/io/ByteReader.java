package com.itacademy.four.io;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * try with resource otvaram zato sto zelim da mi je closable, u suprotnom imamo curenje memorije
 * memory leak
 */
 class ByteReader implements Reader {

    @Override
    public String read(String path) throws ReaderException {


        try (FileInputStream fis = new FileInputStream(path);) {
            StringBuilder stringBuilder = new StringBuilder();
            int c;
            while ((c = fis.read()) != -1) {
                stringBuilder.append((char) c);
            }
            return stringBuilder.toString();
        } catch (IOException e) {
            throw new ReaderException(e.getMessage());
        }
    }
}



