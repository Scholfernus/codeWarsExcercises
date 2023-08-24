package org.example.w3resource.com.genericMethods;

import java.util.ArrayList;
import java.util.List;

public class ReturnListInReverseOrder {
    public static <T> List<T> reverseList(List<T> elements) {
        List<T> reversedList = new ArrayList<>();
        for (int i = elements.size() - 1; i >= 0; i--) {
            reversedList.add(elements.get(i));
        }
        return reversedList;
    }

    public static void main(String[] args) {
        List<String> colors = List.of("Red", "Blue", "Yellow", "Green");
        List<Integer> numbers = List.of(1, 3, 4, 6, 7, 10);

        List<Integer> reversedNumbers = reverseList(numbers);
        System.out.println("Original list of numbers: " + numbers);
        System.out.println("Reversed numbers: " + reversedNumbers);

        List<String> reversedColors = reverseList(colors);
        System.out.println("Original list of colors: " + colors);
        System.out.println("Reversed colors: " + reversedColors);

    }
}
