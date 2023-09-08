package org.example.w3resource.com.objectOrientedProgramming.travel;

import java.util.ArrayList;
import java.util.Random;

public class BookHotelBookFlight {
    private ArrayList<Flight> flights;
    private ArrayList<Hotel> hotels;

    public BookHotelBookFlight() {
        this.flights = new ArrayList<Flight>();
        this.hotels = new ArrayList<Hotel>();
    }

    public void searchFlights(String origin, String destination, String date, int numPassengers) {
        System.out.println("Searching for flight s from " + origin + " to " + destination +
                " on " + date + " for " + numPassengers + " passengers.");
    }

    public void searchHotels(String location, String checkIn, String checkOut, int numGuests) {
        System.out.println("Searching for hotels in " + location + " from " + checkIn + " to " + checkOut);
    }

    public void bookFlight(int flightNumber, String passengerName, String origin, String destination, String date, int numPassengers, double price) {
        Flight flight = new Flight(flightNumber, passengerName, origin, destination, date, numPassengers, price);
        int confirmationNumber = generateConfirmationNumber();
        flight.setConfirmationNumber(confirmationNumber);
        this.flights.add(flight);
        System.out.println("Flight booked! Confirmation number: " + confirmationNumber);
    }
    public void bookHotel(int hotelId, String guestName, String location, String checkIn, String checkOut, int numGuests, double price){
        Hotel hotel = new Hotel(hotelId, guestName, location,checkIn,checkOut,numGuests,price);
        int confirmationNumber = generateConfirmationNumber();
        hotel.setConfirmationNumber(confirmationNumber);
        this.hotels.add(hotel);
        System.out.println("Hotel booked! Confirmation number: " + confirmationNumber);
    }
    private int generateConfirmationNumber() {
        Random random = new Random();
        return random.nextInt(900000) + 100000;
    }
}
