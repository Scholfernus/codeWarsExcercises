package org.example.w3resource.com.basic1.from1to50;

import java.util.Scanner;

public class Ex7 {
    // Write a Java program that takes a number as input and prints its multiplication table up to 10.
    //Test Data:
    //Input a number: 8
    //Expected Output :
    //8 x 1 = 8
    //8 x 2 = 16
    //8 x 3 = 24
    //...
    //8 x 10 = 80
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input number: ");
        int a = scanner.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(a + " * " + i + " = " + a * i);
        }
    }
}
