package org.example.w3resource.com.enumTypes;

public class Weekend {
    public static enum WeekendDays{
        SATURDAY,
        SUNDAY
    }

    public static void main(String[] args) {
        WeekendDays firstDayOfWeekend = WeekendDays.SATURDAY;
        WeekendDays secondDaysOfWeekend = WeekendDays.SUNDAY;
        System.out.printf("First day of weekend is %s.\n",firstDayOfWeekend);
        System.out.printf("Second day of weekend is %s.",secondDaysOfWeekend);
    }
}
