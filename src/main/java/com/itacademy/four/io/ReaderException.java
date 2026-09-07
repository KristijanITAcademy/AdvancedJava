package com.itacademy.four.io;

/**
 * checked -> svi koji extend Exception
 * unchecked -> svi koji extend RuntimeException
 *
 *
 */
public class ReaderException extends Exception {
    public ReaderException(String message) {
        super("READER: '%s'".formatted(message));
    }
}
