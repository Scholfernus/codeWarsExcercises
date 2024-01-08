package org.example.w3resource.com.enumTypes.exercises;

public class Ex5 {
    //    Write a Java program that defines an enum called "Months" with constants representing the months of the year.
    enum Months{
        JANUARY,
        FEBRUARY,
        MARCH,
        APRIL,
        MAY,
        JUNE,
        JULY,
        AUGUST,
        SEPTEMBER,
        OCTOBER,
        NOVEMBER,
        DECEMBER
    }
    public static void main(String[] args) {
        Months currentMonth = Months.JANUARY;
        System.out.println("Current month is " + currentMonth);
    }
}
