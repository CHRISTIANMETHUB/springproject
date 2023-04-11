package com.example.springproject.banking;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookingRepository extends JpaRepository<BookingModel, Integer> {

//    void addBooking(BookingModel bookingModel) throws DuplicateBookingException ;

    List<BookingModel> findAll();

//    BookingModel searchBooking(int bookingId) throws BookingNotFoundException;
//
//    void updateBooking(int bookingId, BookingModel updatedBookingModel) throws BookingNotFoundException;
//
//    void deleteBooking(int bookingId) throws BookingNotFoundException;
//    void displayBookings();

}