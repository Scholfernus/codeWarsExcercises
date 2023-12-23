package org.example.w3resource.com.basic1.from51to100;

import java.util.Scanner;

public class Ex53 {
    // Write a Java program that accepts three integers from the user.
    // It returns true if the second number is higher than the first number and the third number is larger than the second number.
    // If "abc" is true, the second number does not need to be larger than the first number.
    public static void main(String[] args) {
        System.out.print("Input the first number: ");
        Scanner scanner = new Scanner(System.in);
        int first = scanner.nextInt();
        System.out.print("Input the second number: ");
        int second = scanner.nextInt();
        System.out.print("Input the third number: sum o f two numbers: ");
        int third = scanner.nextInt();
        System.out.println("Numbers " + isItBigger(first,second,third));
    }
    public static boolean isItBigger(int a, int b, int c){
        return ((a<b)&&(b<c));
    }
}
