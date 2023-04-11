package com.example.springproject.banking;

import jdk.nashorn.internal.ir.annotations.Ignore;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name="booking")
public class BookingModel {

    @Id
    private int id;
    @Column(name="source")
    private String source;
    @Column(name="destination")
    private String destination;
    @Column(name="ticket_class")
    private String ticketClass;
    @Column(name="no_of_passengers")
    private int noOfPassengers;
    @Column(name="round_trip")
    private boolean roundTrip;


    public BookingModel() {
        // default constructor
    }

    public BookingModel(int bookingId, String source, String destination, String ticketClass, int noOfPassengers, boolean roundTrip) {
        this.id = bookingId;
        this.source = source;
        this.destination = destination;
        this.ticketClass = ticketClass;
        this.noOfPassengers = noOfPassengers;
        this.roundTrip = roundTrip;
    }

    @Override
    public String toString() {
        return "BookingModel [bookingId=" + id + ", source=" + source + ", destination=" + destination
                + ", ticketClass=" + ticketClass + ", noOfPassengers=" + noOfPassengers + ", roundTrip=" + roundTrip
                + "]";
    }
}