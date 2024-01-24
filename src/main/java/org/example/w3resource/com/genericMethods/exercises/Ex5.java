package org.example.w3resource.com.genericMethods.exercises;

import java.util.ArrayList;
import java.util.List;

public class Ex5 {
    //    Write a Java program to create a generic method that takes two lists of the same type and merges them into a single list.
//    This method alternates the elements of each list.
    public static <T> List<T> collectTwoLists(List<T> one, List<T> two) {
        List<T> twoLists = new ArrayList<>();
        for (T elem : one) {
            twoLists.add(elem);
        }
        for (T elem : two) {
            twoLists.add(elem);
        }
        return twoLists;
    }

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        List<Integer> integers = List.of(6, 7, 8, 9, 10, 11, 12);
        List<String> colors = List.of("Red", "Green", "Blue", "Orange", "White");
        List<String> colors2 = List.of("Yellow", "Purple", "Black", "Peach");
        List<Integer> listOfNumbers = collectTwoLists(numbers, integers);
        System.out.println(numbers);
        System.out.println(integers);
        System.out.println(listOfNumbers);
        List<String> twoLists = collectTwoLists(colors, colors2);
        System.out.println(colors);
        System.out.println(colors2);
        System.out.println(twoLists);
    }
}
