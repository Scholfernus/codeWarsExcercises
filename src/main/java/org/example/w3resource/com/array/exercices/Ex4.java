package org.example.w3resource.com.array.exercices;

public class Ex4 {
    //    Write a Java program to calculate the average value of array elements.
    public static void main(String[] args) {
        int sum = 0;
        double average = 0;
        int[] numbers = {2, 3, 9, 7, 1, 5, -5, -8, 12,33};
        for (int numb : numbers ) {
            sum+=numb;
        }
        System.out.println(sum);
        average = (double) sum / numbers.length;
        System.out.println("Średnia liczb tablicy wynosi: " + average);
    }
}
