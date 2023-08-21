package org.example.w3resource.com.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;

public class FindMinAndMaxInteger {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(List.of(1, 3, 5, 9, 7, 6, 1, 3, 5, -10, 4, 9, 8, 3, 6, 11, 5, 2, 7, 4, 6));
        OptionalInt min = numbers.stream().mapToInt(Integer::shortValue).min();
        OptionalInt max = numbers.stream().mapToInt(Integer::shortValue).max();
        System.out.println("Minimum value: " + min.orElse(0));
        System.out.println("Maximum value: " + max.orElse(0));
        Optional<Integer> max1 = numbers.stream().max(Integer::compareTo);
        // ta sama metoda pisana jak powyżej
        Optional<Integer> min1 = numbers.stream().min((x, y) -> x.compareTo(y));
        System.out.println("Minimum value: " + min1.orElse(null));
        System.out.println("Maximum value: " + max1.orElse(null));
    }
}
