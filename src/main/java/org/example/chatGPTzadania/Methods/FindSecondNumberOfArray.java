package org.example.chatGPTzadania.Methods;

import java.util.Arrays;

public class FindSecondNumberOfArray {
    public static void main(String[] args) {
        int[] numbers = {5, 2, 8, 1, 9, -4};
        findSecondLargest(numbers);

    }
    public static void findSecondLargest(int[]diffNumbers){
        Arrays.sort(diffNumbers);
        int secondLargest = diffNumbers[diffNumbers.length - 2];
        if (secondLargest==diffNumbers[diffNumbers.length-2]){
            System.out.println("Liczby tego zbioru są identyczne");
        }
        System.out.println("Druga największa liczba tablicy, to: " + secondLargest);
    }
}
