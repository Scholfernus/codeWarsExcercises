package org.example.w3resource.com.conditionalStatement.exercises;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

public class Ex7 {
    //    Write a Java program to find the number of days in a month.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj miesiąc wyrażając go w cyfrach: od 1 do 12 ");
        int numbOfMonth = scanner.nextInt();
        System.out.println("Podaj rok w postaci 4 cyfr:  ");
        int numbOfYear = scanner.nextInt();
        if (numbOfMonth>=1 && numbOfMonth<=12 &&numbOfYear>1000 && numbOfYear<9999){
            LocalDate localDate = LocalDate.of(numbOfYear, numbOfMonth, 2);
            int lengthOfMonth = localDate.lengthOfMonth();
            DayOfWeek dayOfWeek = localDate.getDayOfWeek();
            int dayOfYear = localDate.getDayOfYear();
            System.out.println("Number of days in the month: " + lengthOfMonth);
            System.out.println("Day of birth: " + dayOfWeek);
            System.out.println("Day of year: " + dayOfYear);
        }else {
            System.out.println("Invalid input. Please enter a valid month (1-12) and year (4 digits).");
        }
    }
}
