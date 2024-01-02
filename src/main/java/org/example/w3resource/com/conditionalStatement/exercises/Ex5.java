package org.example.w3resource.com.conditionalStatement.exercises;

import java.util.Scanner;

public class Ex5 {
    //    Write a Java program that takes a number from the user and generates an integer between 1 and 7. It displays the weekday name.
//    Input number: 3   Expected Output : Wednesday
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj dowolną liczbę od 1 do 7: ");
        int day = scanner.nextInt();
        System.out.println(getDayOfWeek(day));

    }
    public static String getDayOfWeek(int number){
        String day = "";
        switch (number){
            case 1:day = "Monday";
                break;
                case 2:day = "Tuesday";
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
                System.out.println("Niepoprawne dane");
        }
        return day;
    }
}
