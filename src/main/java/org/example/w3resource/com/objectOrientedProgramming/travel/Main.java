package org.example.w3resource.com.objectOrientedProgramming.travel;

public class Main {
    public static void main(String[] args) {
        BookHotelBookFlight app = new BookHotelBookFlight();
        app.searchFlights("New York", "London", "2022=09=01",1);
        app.searchHotels("London","2022-08-01","2022-09-05",2);
    }
}
