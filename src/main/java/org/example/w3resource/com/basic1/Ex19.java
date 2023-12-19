package org.example.w3resource.com.basic1;

public class Ex19 {
    //Write a Java program to convert an integer number to a binary number.
    //Input Data:
    //Input a Decimal Number : 5
    public static void main(String[] args) {
    int numberToBinary = 5;
        String binaryString = Integer.toBinaryString(numberToBinary);
        System.out.println(binaryString);
    }
}
