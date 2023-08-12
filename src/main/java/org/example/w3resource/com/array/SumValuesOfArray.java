package org.example.w3resource.com.array;

public class SumValuesOfArray {
    public static void main(String[] args) {
        int sum = 0;
        int[] numbers = {2, 4, -35, 6, 15, 8, 3, 1};
        for (int num :numbers) {
            sum+=num;
        }
        System.out.println("Suma wszystkich liczb tablicy wynosi: " + sum);
    }
}
