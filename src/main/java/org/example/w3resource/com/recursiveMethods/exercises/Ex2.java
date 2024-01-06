package org.example.w3resource.com.recursiveMethods.exercises;

import java.util.Scanner;

public class Ex2 {
    //    Write a Java recursive method to calculate the sum of all numbers from 1 to n.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj dowolną licznę n: ");
        int number = scanner.nextInt();
        if (number >= 1) {
            int sum = calculateSum(number);
            System.out.println("Suma " + number + " to: " + sum);
        } else {
            System.out.println("Podana liczba nie jest dodatnia.");
        }
    }
    private static int calculateSum(int numb){
        if (numb==1) {
            return 1;
        }else {
            return numb + calculateSum(numb - 1);
        }
    }
}
