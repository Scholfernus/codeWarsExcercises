package org.example.w3resource.com.recursiveMethods;

public class SumOfOddNumbersInArray {
    public static int sum(int[] array) {
        int together = 0;
//        int[] numbers = {1, 3, 6, 4, 8, 7, 11, 14, 20};
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                together += array[i];
            }
        }
        return together;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 3, 6, 4, 8, 7, 11, 14, 20};
        System.out.println("Suma liczb parzystych wynosi: " + sum(numbers));
    }
}
