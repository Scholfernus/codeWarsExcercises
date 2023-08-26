package org.example.w3resource.com.genericMethods;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ListAndPredicate {
    public static <T> List<T> filterList(List<T> list, Predicate<T> predicate) {
        List<T> filteredList = new ArrayList<>();
        for (T element : list) {
            if (predicate.test(element)) {
                filteredList.add(element);
            }
        }
        return filteredList;
    }

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12);
        System.out.println("Original list of numbers: " + numbers);
        List<Integer> evenNumbers = filterList(numbers, n -> n % 2 == 0);
        System.out.println("Even numbers: " + evenNumbers);

        List<Integer> oddNumbers = filterList(numbers, n -> n % 2 != 0);
        System.out.println("Odd numbers: " + oddNumbers);

        List < String > colors = List.of("Red", "Green", "White", "Orange", "Black", "Pink");
        System.out.println("\nOriginal list of Colors: " + colors);

        List<String> wordsStartingWithO = filterList(colors, color -> color.startsWith("O"));
        System.out.println("Colors starting with 'O': " + wordsStartingWithO);

        List<String> wordsLengthGreaterThan4 = filterList(colors, color -> color.length() > 4);
        System.out.println("Colors with length greater than 4: " + wordsLengthGreaterThan4);
    }
}
