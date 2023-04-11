package com.example.springproject.banking;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "booking")
public class BookingController {

    @Autowired
    private BookingService bookingService;

    @GetMapping(value ="/getAll")
    public ResponseEntity<List<BookingModel>> getAll(){
        return ResponseEntity.ok(bookingService.getAllBooking());
    }
}
