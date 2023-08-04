package org.example.w3resource.com.javaBasics;

import java.util.Scanner;

public class SumOfFiveNumbers {
    public static void main(String[] args) {
        int sum = 0;
        double average;
        System.out.println("Input five numbers: ");
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            int num = scan.nextInt();
            sum += num;
        }
        average = (double) sum / 5;
        System.out.println("The sum of the 5 numbers is " + sum + "\nThe average is " + average);
    }
}
