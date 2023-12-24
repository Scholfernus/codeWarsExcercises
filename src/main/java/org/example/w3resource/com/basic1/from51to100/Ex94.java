package org.example.w3resource.com.basic1.from51to100;

public class Ex94 {
    //    Write a Java program to rearrange all the elements of a given array of integers
//    so that all the odd numbers come before all the even numbers.
    public static void main(String[] args) {
        int[] numbers = {2, 15, 22, 24, 456, -4, -25, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int temp;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                temp = numbers[i];
                numbers[i]= numbers[i+1];
                numbers[i+1]=temp;
            }
        }

    }
}
