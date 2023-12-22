package org.example.w3resource.com.basic1;

import java.util.Scanner;

public class Ex56 {
    //Write a Java program to find the number of values in a given range divisible by a given value.
    //For example x=5, y=20 and p=3,
    // find the number of integers within the range x..y and that are divisible by p i.e. { i :x ≤ i ≤ y, i mod p = 0 }
    public static void main(String[] args) {
        System.out.print("Input the first number: ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.print("Input the second number: ");
        int b = scanner.nextInt();
        System.out.print("Input the third number: numbers divided by: ");
        int c = scanner.nextInt();
        for (int i = a; i < b; i++) {
            if (i % c == 0) {
                System.out.print(i + ", ");
            }
        }

    }
}

