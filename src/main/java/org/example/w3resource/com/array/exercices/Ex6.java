package org.example.w3resource.com.array.exercices;

public class Ex6 {
    //    Write a Java program to find the index of an array element.
    public static void main(String[] args) {
        int[] numbers = {2, 3, 9, 7, 1, 5, -5, -8, 12, 33};
        int numb = -8;
        int index = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == numb) {
                index = i;
            } else {
                System.out.print("The number " + numb + " doesn't exist.");
            }
        }

        System.out.print("Indeks szukanej liczby wynosi: " + index);
    }
}
