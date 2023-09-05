package org.example.w3resource.com.objectOrientedProgramming.travel;

import java.util.ArrayList;
import java.util.Date;

public class Hotel {
    private int hotelId;
    private String hotelName;
    private String city;
    private String checkIn;
    private String checkOut;
    private int numGuests;
    private double price;
    private int confirmationNumber;


    private Date date;

    public Hotel(int hotelId, String hotelName, String city, String checkIn, String checkOut, int numGuests, double price) {
        this.hotelId = hotelId;
        this.hotelName = hotelName;
        this.city = city;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        this.numGuests = numGuests;
        this.price = price;
    }

    public int getHotelId() {
        return hotelId;
    }

    public String getHotelName() {
        return hotelName;
    }

    public String getCheckIn() {
        return checkIn;
    }

    public String getCheckOut() {
        return checkOut;
    }

    public int getNumGuests() {
        return numGuests;
    }

    public double getPrice() {
        return price;
    }

    public int getConfirmationNumber() {
        return confirmationNumber;
    }

    public String getHotel() {
        return hotelName;
    }

    public String getCity() {
        return city;
    }

    public Date getDate() {
        return date;
    }
    public void setConfirmationNumber(int confirmationNumber){
        this.confirmationNumber = confirmationNumber;
    }
}
