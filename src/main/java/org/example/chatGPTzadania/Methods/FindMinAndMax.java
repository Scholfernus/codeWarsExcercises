package org.example.chatGPTzadania.Methods;

public class FindMinAndMax {
    public static void main(String[] args) {
        int[] test = {2, 10, -7, 15, 8};
        int[]minMax = findMinMax(test);
        System.out.println("Najmniejsza liczba to:" + minMax[0] +
                " Największa liczba to: " + minMax[1]);
    }

    public static int[] findMinMax(int[] numbers) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        return new int[]{min,max};
    }
}

