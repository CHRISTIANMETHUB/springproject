package com.example.springproject.banking;

public class BookingNotFoundException extends Exception {
    public BookingNotFoundException(String message) {
        super(message);
    }
}