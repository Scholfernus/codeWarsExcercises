package org.example.w3resource.com.basic1;

import java.util.Scanner;

public class Ex41 {
    //Write a Java program to print the ASCII value of a given character.
    //The ASCII value of Z is :90
    public static void main(String[] args) {
        System.out.println("Podaj dowolną literę z małej lub wielkiej litery: ");
        Scanner scanner = new Scanner(System.in);
        String letter = scanner.nextLine();
        char[] array = letter.toCharArray();
        int value1 = array[0];
        System.out.println("The ASCII value of letter" + letter + " is " + value1);
        System.out.println(value1);
    }
}
