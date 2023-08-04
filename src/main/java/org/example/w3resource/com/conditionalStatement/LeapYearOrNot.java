package org.example.w3resource.com.conditionalStatement;

import java.util.Scanner;

public class LeapYearOrNot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();
        if ((year % 400 == 0) || (year % 4 == 0) && (year % 100 != 0)) {
            System.out.println(year + " is a leap year");
        } else {
            System.out.println(year + " is not a leap year");
        }
    }
}

// Write a Java program that takes a year from the user and prints whether it is a leap year or not.
//
//Test Data
//Input the year: 2016
//Expected Output :
//2016 is a leap year