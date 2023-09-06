package org.example.w3resource.com.objectOrientedProgramming.travel;

import java.util.ArrayList;

public class BookHotelBookFlight {
    private ArrayList<Flight> flights;
    private ArrayList<Hotel> bookHotel;

    public BookHotelBookFlight() {
        this.flights = new ArrayList<Flight>();
        this.bookHotel = new ArrayList<Hotel>();
    }
    public void searchFlights(String origin, String destination,String date, int numPassengers){
        System.out.println("Searching for flight s from " + origin + " to " + destination +
                " on " + date + " for " + numPassengers + " passengers.");
    }
}
