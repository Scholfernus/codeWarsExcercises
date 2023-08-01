package org.example.w3resource.com;

import java.util.Scanner;

public class BinaryNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Give a number:");
        int number = input.nextInt();
        int number2 = 11;
        String binaryString = Integer.toBinaryString(number);
        String binaryString2 = Integer.toBinaryString(number2);
        System.out.println(binaryString);
        System.out.println(binaryString2);
    }
}
