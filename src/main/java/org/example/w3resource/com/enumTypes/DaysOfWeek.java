package org.example.w3resource.com.enumTypes;

public enum DaysOfWeek {
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY,
        SUNDAY;
    public static void main(String[] args) {
        DaysOfWeek today = DaysOfWeek.THURSDAY;
        System.out.println("Today is " + today);
    }
}
