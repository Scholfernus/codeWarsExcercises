package org.example.w3resource.com;

import java.util.Scanner;

public class EnterNumberPrintDayOfWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj dowolną liczbę od 1 do 7: ");
        int dayOfWeek = scanner.nextInt();
        System.out.println(getDayName(dayOfWeek));
    }
    public static String getDayName(int dayOfWeek) {
            String day = "";
        switch (dayOfWeek) {

            case 1:day = "Monday";
                break;
            case 2: day ="Tuesday";
                break;
            case 3:day = "Wednesday";
                break;
            case 4:day = "Thursday";
                break;
            case 5:day = "Friday";
                break;
            case 6:day = "Saturday";
                break;
            case 7:day = "Sunday";
                break;
            default:
                System.out.println("Niepoprawne dane.");
                break;
        }
        return day;
    }

}




