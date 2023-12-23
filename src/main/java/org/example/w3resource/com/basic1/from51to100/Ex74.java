package org.example.w3resource.com.basic1.from51to100;

public class Ex74 {
    //    Write a Java program to test if 10 appears as the first or last element of an array of integers.
//    The array length must be broader than or equal to 2
    public static void main(String[] args) {
        int[] numbers = {10, 15, 22, -3, 24, 1};
        if (numbers[numbers.length - 1] == 10) {
            System.out.println("Tablica zawiera liczbę 10 na końcu");
        } else if (numbers[0] == 10) {
            System.out.println("Tablica zawiera liczbę 10 na początku");
        } else {
            System.out.println("Fake");
        }
    }
}
