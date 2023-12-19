package org.example.w3resource.com.basic1;

import org.example.w3resource.com.conditionalStatement.BinaryNumbers;

public class Ex17 {
    //Write a Java program to add two binary numbers.
    //Input Data:
    //Input first binary number: 10
    //Input second binary number: 11
    public static void main(String[] args) {
        int first = 10;
        int second = 11;
        String binaryString1 = Integer.toBinaryString(first);
        System.out.println(binaryString1);
        String binaryString2 = Integer.toBinaryString(second);
        System.out.println(binaryString2);
        int firstBinary = Integer.parseInt(binaryString1);
        int secondBinary = Integer.parseInt(binaryString2);
        int sum = firstBinary+secondBinary;
        System.out.println(sum);

    }
}
