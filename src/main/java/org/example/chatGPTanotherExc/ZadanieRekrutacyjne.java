package org.example.chatGPTanotherExc;

import java.util.Arrays;

public class ZadanieRekrutacyjne {
    public static void main(String[] args) {


        int[] numbers = {4, 6, 2, 3, 7, 8, 1, 9, 0};
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(sorted(numbers)));
    }

    public static int[] sorted(int[] sort) {
        return Arrays.stream(sort).sorted().toArray();
    }
}
