package org.example.w3resource.com.lambda;

import java.util.ArrayList;
import java.util.List;

public class CalculateSumSquaresOfOddEvenNumbersList {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(List.of(1, 3, 5, 9, 7, 6, 1, 3, 5, -10, 4, 9, 8, 3, 6, 11, 5, 2, 7, 4, 6));
        Integer sumOfSquares = numbers.stream().filter(n -> n % 2 == 0).mapToInt(n -> n * n).sum();
        System.out.println(sumOfSquares);
        int sumOfEven = numbers.stream().filter(n -> n % 2 != 0).mapToInt(n -> n * n).sum();
        System.out.println(sumOfEven);
    }
}
