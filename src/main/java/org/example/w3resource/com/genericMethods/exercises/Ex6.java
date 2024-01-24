package org.example.w3resource.com.genericMethods.exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Ex6 {
    //    Write a Java program to create a generic method that takes a list of any type and a predicate.
//    It returns an array list containing only elements that satisfy the predicate.
    public static <T> List<T> fitToFilter(List<T> elem, Predicate<T> filter) {
        List<T> matchList = new ArrayList<>();
        for (int i = 0; i < elem.size(); i++) {
            if (filter.test(elem.get(i))) {
                matchList.add(elem.get(i));
            }
        }
        return matchList;
    }

    public static void main(String[] args) {
        List<Integer> integers = List.of(6, 7, 8, 9, 10, 11, 12);
        Predicate<Integer> isEven = n -> n % 2 == 0;
        List<Integer> fittedToFilter = fitToFilter(integers, isEven);
        System.out.println(integers);
        System.out.println(fittedToFilter);
        List < Integer > oddNumbers = fitToFilter(integers, (n -> n % 2 != 0));
        System.out.println("Odd numbers: " + oddNumbers);
        List < String > colors = List.of("Red", "Green", "White", "Orange", "Black", "Pink");
        System.out.println("\nOriginal list of Colors: " + colors);
        List < String > wordsStartingWithO = fitToFilter(colors, color -> color.startsWith("O"));
        System.out.println("Colors starting with 'O': " + wordsStartingWithO);
        List < String > wordsLengthGreaterThan4 = fitToFilter(colors, color -> color.length() > 4);
        System.out.println("Colors with length greater than 4: " + wordsLengthGreaterThan4);
        List<Integer> listGreaterThenTen = fitToFilter(integers, n -> n > 10);
        System.out.println(listGreaterThenTen);
    }
}
