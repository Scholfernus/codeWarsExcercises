package org.example.w3resource.com.recursiveMethods.exercises;

import java.util.Scanner;

public class Ex14 {
    //    Write a Java recursive method to find the sum of the digits of a given integer.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a number of digits: ");
        int number = scanner.nextInt();
        int sumOfDigit = sumOfDigit(number);
        System.out.println(sumOfDigit);

    }
    public static int sumOfDigit(int number){
        if (number < 10) {
            return number;
        }
        int lastDigit = number % 10;
        int remainingNumber = number / 10;

        return lastDigit + sumOfDigit(remainingNumber);
    }
}
