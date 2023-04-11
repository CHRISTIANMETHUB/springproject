package com.example.springproject.banking;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookingService {

    @Autowired
    private BookingRepository bookingRepository;

    public List<BookingModel> getAllBooking() {
        return bookingRepository.findAll();
    }
}
