package com.itacademy.four.io.writer;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/**
 * -> byte po byte saljemo sadrzaj - content u file - path
 */
 class ByteWriter implements Writer{

    @Override
    public void write(String path, String content) throws WriterException {
        try (FileOutputStream fileOutputStream = new FileOutputStream(path);){
            fileOutputStream.write(content.getBytes(StandardCharsets.UTF_8));
        } catch (IOException e){
            System.err.println(e.getMessage());
        }
    }

}
