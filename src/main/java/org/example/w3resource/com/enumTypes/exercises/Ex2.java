package org.example.w3resource.com.enumTypes.exercises;

public class Ex2 {
    //    Write a Java program to create an enum called "Weekend" with constants representing the days of the weekend.
    enum Weekend {
        FRIDAY, SATURDAY, SUNDAY;
    }
    public static void main(String[] args) {
        Weekend dayOfWeekend = Weekend.SUNDAY;
        System.out.println("One of the days of weekend: " + dayOfWeekend);
    }
}

