package com.dmdev.oop.lesson20.exception;

public class DmdevException extends RuntimeException {

    public DmdevException(String message) {
        super(message);
    }

    public DmdevException(Throwable cause) {
        super(cause);
    }
}
