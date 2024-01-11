package org.example.w3resource.com.array.exercices;

public class Ex2 {
    //    Write a Java program to sum values of an array.
    public static void main(String[] args) {
        int sum = 0;
        int[] numbers = {2, 3, 9, 7, 1, 5, -5, 8, 12};
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println(sum);
        for (int numb : numbers) {
            sum += numb;
        }
        System.out.println(sum);
    }
}
