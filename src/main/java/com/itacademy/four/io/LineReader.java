package com.itacademy.four.io;

import java.awt.datatransfer.FlavorListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * DECORATOR
 * FileReader
 *
 * BufferedReader -> character iz jedne linije pomocu  FileReader i kada dode do nove linije
 * skladisti u jednu liniju Strinf Line itd ..
 *
 * MilkDecorator
 *
 * new MilkDecoratot(new Caffe)
 * new BufferedReader(new FileReader());
 */
class LineReader implements Reader{
    @Override
    public String read(String path) throws ReaderException {
        try {
            StringBuilder sb = new StringBuilder();
            BufferedReader br = new BufferedReader(new FileReader(path));
            String line;
            while ((line = br.readLine()) != null){
                String lineSeparator = System.lineSeparator();
                sb.append(line).append(lineSeparator);
            }
            return sb.toString();
        }catch (Exception exception){
            throw new ReaderException(exception.getMessage());
        }
    }
}
