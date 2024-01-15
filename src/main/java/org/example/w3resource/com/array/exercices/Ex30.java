package org.example.w3resource.com.array.exercices;

public class Ex30 {
    //    Write a Java program to check if an array of integers is without 0 and -1.
    public static void main(String[] args) {
        int[] arr = {2, 3, 9, 8, 7, 33, 0, 1, 500, -1, 5, 1};
        for (int numb : arr) {
            if (numb == 0 || numb == -1) {
                System.out.print("Arrays is with " + numb);
            }
        }
    }
}
