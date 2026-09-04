package com.itacademy.two.exception;

public class TextFileNotFoundException extends RuntimeException {
    public TextFileNotFoundException(String message) {
        super(message);
    }
}
