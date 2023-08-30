package org.example.w3resource.com.objectOrientedProgramming;

import java.time.LocalTime;

public class Airplane {
    private String flightNumber;
    private String destination;
    private LocalTime timeOfDeparture;
    private int delayTime;

    public Airplane(String flightNumber, String destination, LocalTime timeOfDeparture) {
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.timeOfDeparture = timeOfDeparture;
        this.delayTime = 0;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getDestination() {
        return destination;
    }

    public LocalTime getTimeOfDeparture() {
        return timeOfDeparture;
    }

    public void setTimeOfDeparture(LocalTime timeOfDeparture) {
        this.timeOfDeparture = timeOfDeparture;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getDelayTime() {
        return delayTime;
    }

    public void delay(int minutes) {
        this.delayTime = minutes;
        this.timeOfDeparture = this.timeOfDeparture.plusMinutes(minutes);
    }

    public void checkStatus() {
        if (delayTime == 0) {
            System.out.println("Flight " + flightNumber + " is on time.");
        }else if (delayTime>300){
            System.out.println("Flight " + flightNumber + " is canceled.");
        }
        else {
            System.out.println("Flight " + flightNumber + " is delayed " + delayTime + " minutes.");
        }
    }
}

class Main11 {
    public static void main(String[] args) {
        Airplane flight1 = new Airplane("CDE345", "London", LocalTime.of(10, 30));
        Airplane flight2 = new Airplane("KUI765", "New York", LocalTime.of(14, 0));
        Airplane flight3 = new Airplane("JUY456", "Paris", LocalTime.of(13, 0));
        Airplane flight4 = new Airplane("LOT326", "Warsaw", LocalTime.of(15, 33));
        System.out.println("Flight status: ");
        flight1.checkStatus();
        flight2.checkStatus();
        flight3.checkStatus();
        flight4.checkStatus();

        flight1.delay(40);
        flight2.delay(110);
        flight3.delay(299);
        flight4.delay(301);

        System.out.println("\nCurrent flight status:");
        flight1.checkStatus();
        flight2.checkStatus();
        flight3.checkStatus();
        flight4.checkStatus();
    }
}