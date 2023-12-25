package org.example.w3resource.com.basic1.from101to150;

public class Ex103 {
    // Write a Java program to create an array from a given array of integers.
// The newly created array will contain elements from the given array after the last element value is 10.
    public static void main(String[] args) {
        int counter = 0;
        int[] newArray = new int[]{};
        int[] numbers = {10, 11, 10, 30, 45, 20, 33, 53};
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 10) {
                counter = numbers[i];
            }
        }
        for (int i =counter+1; i < numbers.length-1-counter; i++) {
            newArray[] = numbers[i];
        }
    }
}

