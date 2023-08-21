package org.example.w3resource.com.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicatesFromIntegerList {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(List.of(1, 3, 5, 9, 7, 6, 1, 3, 5, 4, 9, 8, 3, 6, 5, 2, 7, 4, 6));
        System.out.println(numbers);
        Set<Integer> collect = numbers.stream().collect(Collectors.toSet());
        System.out.println(collect);
        List<Integer>uniqueNumbers = new ArrayList<>();
        numbers.stream().distinct().forEach(uniqueNumbers::add);
        System.out.println(uniqueNumbers);
    }
}
