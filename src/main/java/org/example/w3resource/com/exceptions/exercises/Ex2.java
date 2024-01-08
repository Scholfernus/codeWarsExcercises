package org.example.w3resource.com.exceptions.exercises;

import java.util.Scanner;

public class Ex2 {
    //    Write a Java program to create a method that takes an integer as a parameter and throws an exception
//    if the number is odd.
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Give some number: ");
            int number = scanner.nextInt();
            oddNumber(number);
            System.out.println("Liczba " + number + " jest parzysta.");
        } catch (Exception e) {
            System.out.println("Upss " + e.getMessage());
        }
    }
    public static void oddNumber(int number) throws Exception {
        if (number % 2 == 0) {
            throw new Exception("podana liczba jest nieparzysta!");
        }
    }
}
