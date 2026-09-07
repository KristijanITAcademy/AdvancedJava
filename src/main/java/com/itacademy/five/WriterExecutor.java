package com.itacademy.five;

import com.itacademy.four.io.writer.Writer;
import com.itacademy.four.io.writer.WriterException;

public class WriterExecutor {

    private Writer writer;

    public WriterExecutor(Writer writer) {
        this.writer = writer;
    }

    public void setWriter(Writer writer) {
        this.writer = writer;
    }
     public void  executeWriter(String path, String content){
        try {
            writer.write(path, content);
        }catch (WriterException e){
            System.err.println(e.getMessage());
        }
     }
}
