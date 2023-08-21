package org.example.w3resource.com.lambda;

import java.util.ArrayList;
import java.util.List;

public class MultiplySumElementsList {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(List.of(1, 3, 5, 9, 7, 6, 1, 3, 5, -10, 4, 9, 8, 3, 6, 11, 5, 2, 7, 4, 6));
        int result = numbers.stream().reduce(1, (x, y) -> x * y);
        System.out.println("\nProduct of the list elements: " + result);
        int sum = numbers.stream().reduce(0, (x, y) -> x + y);
        System.out.println("\nProduct of the list elements: " + sum);
    }
}
