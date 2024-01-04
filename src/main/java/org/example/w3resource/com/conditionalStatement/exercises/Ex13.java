package org.example.w3resource.com.conditionalStatement.exercises;

import java.util.Scanner;

public class Ex13 {
//    Write a Java program to display the cube of the given number up to an integer.
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Podaj dowolną liczbę.");
    int number = scanner.nextInt();
    int sum = number * number * number;
    System.out.println("Suma wszystkich liczb do potęgi 3 wynosi: " + sum);
}
}
