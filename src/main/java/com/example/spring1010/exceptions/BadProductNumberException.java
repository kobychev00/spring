package com.example.spring1010.exceptions;

public class BadProductNumberException extends RuntimeException{
    public BadProductNumberException(String message) {
        super(message);
    }
}
