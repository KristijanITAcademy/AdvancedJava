package com.itacademy.four.io.writer;

public class WriterException extends Exception {
    public WriterException(String message) {
        super("Writer: '%s' ".formatted(message));
    }
}
