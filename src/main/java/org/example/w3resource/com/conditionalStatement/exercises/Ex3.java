package org.example.w3resource.com.conditionalStatement.exercises;

import java.util.Arrays;
import java.util.Scanner;

public class Ex3 {
    //    Write a Java program that takes three numbers from the user and prints the greatest number.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj dowolną 1-szą liczbę: ");
        int numb1 = scanner.nextInt();
        System.out.println("Podaj dowolną 2-gą liczbę: ");
        int numb2 = scanner.nextInt();
        System.out.println("Podaj dowolną 3-cią liczbę: ");
        int numb3 = scanner.nextInt();
        int greatest = numb1;
        if (numb2>greatest){
            greatest=numb2;
        }
        if (numb3>greatest){
            greatest=numb3;
        }
        System.out.println("The greatest: " + greatest);
    }
}
// int numb3 = scanner.nextInt();
//        if (numb2>numb1&&numb2>numb3){
//            System.out.println(numb2);
//        } else if (numb3>numb1&&numb3>numb2) {
//            System.out.println(numb3);
//        }else {
//            System.out.println(numb1);
//        }