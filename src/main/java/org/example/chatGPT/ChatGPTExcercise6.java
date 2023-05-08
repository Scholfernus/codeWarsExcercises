package org.example.chatGPT;

import java.util.*;
import java.util.stream.IntStream;

public class ChatGPTExcercise6 {
    public static void main(String[] args) {
        List<Integer> numbersToSOrt = new ArrayList<>(List.of(5, -3, 10, 16, -25, 0, 12, 3));
        System.out.println(minMax(numbersToSOrt) + " " + minMax2(numbersToSOrt));
    }
    public static int minMax(List<Integer> numbers) {
        Collections.sort(numbers);
        int min = numbers.get(0);
        return min;
    }
    public static int minMax2(List<Integer> numbers2) {
        Collections.sort(numbers2);
        int max = numbers2.get(numbers2.size()-1);
        return max;
    }
}
