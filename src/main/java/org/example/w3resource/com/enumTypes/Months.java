package org.example.w3resource.com.enumTypes;

public class Months {
    public static enum Month{
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
        Month firstMonth = Month.JANUARY;
        System.out.println(firstMonth);
    }
}
