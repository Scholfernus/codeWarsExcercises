package org.example.w3resource.com.array.exercices;

public class Ex27 {
    //    Write a Java program to find the number of even and odd integers in a given array of integers.
    public static void main(String[] args) {
        int[] arr = {2, 3, 9, 8, 7, 33, 1, 500, 5, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.print("Even number " + arr[i] + ", ");
            } else {
                System.out.print("Odd number " + arr[i] + ", ");
            }
        }
    }
}
