package org.example.chatGPT;

import java.util.*;
import java.util.stream.IntStream;

public class ChatGPTExcercise6 {
    // 6. Znajdowanie maksymalnej i minimalnej wartości w liście
    public static void main(String[] args) {
        List<Integer> numbersToSOrt = new ArrayList<>(List.of(5, -3, 10, 16, -25, 0, 12, 3, 100));
        System.out.println(minMax(numbersToSOrt));
    }

    public static List<Integer> minMax(List<Integer> numbers) {
        int min = Collections.min(numbers);
        int max = Collections.max(numbers);
        return List.of(min, max);
    }
}
