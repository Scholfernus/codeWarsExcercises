package org.example.w3resource.com;

import java.util.Scanner;

public class SumOfOddNumbers {
    public static void main(String[] args) {
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę: ");
        int num = scanner.nextInt();
        for (int i = 0; i < num * 2; i++) {
            if (i % 2 != 0) {
                sum += i;
                System.out.println(i);
            }
        }
        System.out.println("The Sum of odd Natural Number upto 5 terms is: " + sum);
    }
}

//  Write a Java program that displays the sum of n odd natural numbers.
//
//Test Data
//Input number of terms is: 5
//Expected Output :
//
//The odd numbers are :
//1
//3
//5
//7
//9
//The Sum of odd Natural Number upto 5 terms is: 25
