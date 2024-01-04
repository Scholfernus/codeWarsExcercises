package org.example.w3resource.com.conditionalStatement.exercises;

import java.util.Scanner;

public class Ex9 {
    //    Write a Java program that takes a year from the user and prints whether it is a leap year or not.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj dowolny rok, żeby sprawdzić czy jest przestępny czy nie: ");
        int year = scanner.nextInt();
        if ((year % 400 == 0) || (year % 4 == 0) && (year % 100 != 0)){
            System.out.println("Rok " + year + " jest przestępny.");
        }else {
            System.out.println("Rok " + year + " nie jest przestępny.");
        }
    }
}
