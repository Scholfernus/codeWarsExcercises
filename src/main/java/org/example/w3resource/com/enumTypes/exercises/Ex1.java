package org.example.w3resource.com.enumTypes.exercises;


public class Ex1 {
     enum DaysOfWeek {
        //    Write a Java program to create an enum called "DaysOfWeek" representing the days of the week
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY,
        SUNDAY
    }
    public static void main(String[] args) {
        DaysOfWeek today = DaysOfWeek.SUNDAY;
        System.out.println("Today is " + today);
    }
}


