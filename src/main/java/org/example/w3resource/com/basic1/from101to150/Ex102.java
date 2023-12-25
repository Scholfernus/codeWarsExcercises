package org.example.w3resource.com.basic1.from101to150;

public class Ex102 {
    //    Write a Java program to check if a specified array of integers contains 10 or 30.
    public static void main(String[] args) {
    int []  numbers = {10, 11, 10, 30, 45, 20, 33, 53};
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i]==10 || numbers[i]==30){
                System.out.println("Tablica zawiera wybraną liczbę: ");
            }
        }
    }
}
