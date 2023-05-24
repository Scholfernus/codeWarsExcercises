package org.example.chatGPTanotherExc;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class ZadanieRekrutacyjne {
    public static void main(String[] args) {


        int[] numbers = {4, 6, 2, 3, 7, 8, 1, 9, 0};
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(sorted(numbers)));
        IntStream intStream = Arrays.stream(numbers);
        intStream.forEach(System.out::print);
        System.out.println(Arrays.toString(new OptionalInt[]{min(numbers)}));
        System.out.println(Arrays.toString(new OptionalInt[]{max(numbers)}));



    }

    public static int[] sorted(int[] sort) {
        return Arrays.stream(sort).sorted().toArray();
    }
    public static OptionalInt min(int[]array){
        OptionalInt min = Arrays.stream(array).min();
        return min;
    }
    public static OptionalInt max(int[]array){
        OptionalInt max = Arrays.stream(array).max();
        return max;
    }
}
