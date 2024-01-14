package org.example.w3resource.com.array.exercices;
import java.util.Arrays;
public class Ex24 {
    //    Write a Java program to find a missing number in an array.
    public static void main(String[] args) {
        int[] arr = {2, 3, 9, 7, 1, 500, 5, 8, 12, 33, 1};
        int n = arr.length + 1;
        int sum = n * (n + 1) / 2;
        int arrSum = Arrays.stream(arr).sum();
        int missingNumber = sum - arrSum;
        System.out.println("The missing number in the array is " + missingNumber);
    }
}
