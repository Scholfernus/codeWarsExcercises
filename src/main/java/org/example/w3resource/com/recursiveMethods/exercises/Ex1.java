package org.example.w3resource.com.recursiveMethods.exercises;

import java.util.Scanner;

public class Ex1 {
    //    Write a Java recursive method to calculate the factorial of a given positive integer
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj dodatnią liczbę całkowitą: ");
        int number = scanner.nextInt();
        if (number >= 0) {
            long factorial = calculateFactorial(number);
            System.out.println("Silnia z " + number + " to: " + factorial);
        } else {
            System.out.println("Podana liczba nie jest dodatnia.");
        }
    }
    private static long calculateFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * calculateFactorial(n - 1);
        }
    }
}
