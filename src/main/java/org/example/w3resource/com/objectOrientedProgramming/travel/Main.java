package org.example.w3resource.com.objectOrientedProgramming.travel;

public class Main {
    public static void main(String[] args) {
        BookHotelBookFlight app = new BookHotelBookFlight();
        app.searchFlights("New York", "London", "2022=09=01",1);
        app.searchHotels("London","2022-08-01","2022-09-05",2);
        app.bookFlight(12345678,"John Noodle","New York",
                "London","2022-09-10",1,688.00);
        app.bookFlight(356498752,"Jenifer Lopez","Newada",
                "London","2022-09-11",1,250);
        app.bookHotel(98564215,"John Noodle","London","2022 - 09 23",
                "2022-09-30",2,290);
        app.cancelReservation(12345670);


    }
}
