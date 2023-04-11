package com.example.springproject.banking;

public class DuplicateBookingException extends Exception {
    public DuplicateBookingException(String message) {
        super(message);
    }
}
