package org.example.streamExc;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
public class ExerciseOnStream {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6));
        numbers.add(5);
        List<Integer> collect = numbers.stream().map(n -> n * 2).collect(Collectors.toList());
        System.out.println(collect);
        System.out.println(numbers);
    }
}