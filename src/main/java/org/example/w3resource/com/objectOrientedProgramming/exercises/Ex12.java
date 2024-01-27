package org.example.w3resource.com.objectOrientedProgramming.exercises;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalTime;

public class Ex12 {
    //     Write a Java program to create a class called "Airplane" with a flight number, destination, and departure time
//     attributes, and methods to check flight status and delay.
    public static void main(String[] args) {
        Airplane plane = new Airplane(253598, "London", LocalTime.of(18,52));
        plane.checkFlight(253598);
        plane.checkDelay(253598,LocalTime.of(18,0));
        plane.checkFlight(123456);
    }
}

@Getter
@Setter
@AllArgsConstructor
class Airplane {
    private int flightNumber;
    private String destination;
    private LocalTime departureTime;

    public boolean checkFlight(int flightNumber) {
       if (this.flightNumber == flightNumber){
           System.out.println("Flight no " + flightNumber + " is on time.");
           return true;
       } else {
           System.out.println("Flight no " + flightNumber + " is not found.");
           return false;
       }
    }

    public void checkDelay(int flightDeparture, LocalTime expectedDeparture) {
        if (departureTime.isAfter(expectedDeparture)){
            System.out.println("Flight no " + flightNumber + " is delayed.");
        }else {
            System.out.println("Flight no " + flightNumber + " is on time.");
        }
    }
}