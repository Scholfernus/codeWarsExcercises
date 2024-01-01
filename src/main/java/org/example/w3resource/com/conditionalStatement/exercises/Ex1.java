package org.example.w3resource.com.conditionalStatement.exercises;

import java.util.Scanner;

public class Ex1 {
    //    Write a Java program to get a number from the user and print whether it is positive or negative.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give some number: ");
        int numb = scanner.nextInt();
        if (numb>0){
            System.out.println("Number is positive");
        }else {
            System.out.println("Number is negative");
        }
    }
}
