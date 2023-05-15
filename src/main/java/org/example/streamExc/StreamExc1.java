package org.example.streamExc;

import java.util.Arrays;
import java.util.List;

public class StreamExc1 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15);
        int sum = numbers.stream()
                .filter(n -> n > 5)
                .mapToInt(n -> n * n)
                .sum();
        System.out.println("Suma kwadratów liczb większych od 5 wynosi: " + sum);
    }
}
