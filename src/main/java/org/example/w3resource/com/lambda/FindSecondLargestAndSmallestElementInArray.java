package org.example.w3resource.com.lambda;

import java.util.Arrays;
import java.util.Comparator;

public class FindSecondLargestAndSmallestElementInArray {
    public static void main(String[] args) {
        int[] numbers = {1, 3, 6, 7, -1, -5, -33, 33, 101, -65, 45, 12, 6, 54};
        int[] arraySorted = Arrays.stream(numbers).sorted().toArray();
        Arrays.stream(arraySorted).forEach(System.out::println);
        Integer secondLargest = Arrays.stream(numbers)
                .distinct()
                .sorted()
                .skip(numbers.length-3)
                .findFirst()
                .orElse(0);
        int secondSmallest = Arrays.stream(numbers)
                .distinct()
                .sorted()
                .skip(1)
                .findFirst()
                .orElse(0);

        System.out.println("Second largest element: " + secondLargest);
        System.out.println("Second smallest element: " + secondSmallest);
    }
}
