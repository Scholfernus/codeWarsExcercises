package org.example.w3resource.com.array.exercices;

public class Ex22 {
    //    Write a Java program to find all pairs of elements in an array whose sum is equal to a specified number.
    public static void main(String[] args) {
        int[] arr = {2, 3, 9, 7, 1, 500, 5, 8, 12, 33, 1};
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == 10) {
                    System.out.print(arr[i] + "-" + arr[j] + ", ");
                }
            }
        }
    }
}
