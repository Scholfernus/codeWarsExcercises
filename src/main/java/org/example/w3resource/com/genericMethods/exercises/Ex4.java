package org.example.w3resource.com.genericMethods.exercises;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ex4 {
    //    Write a Java program to create a generic method that takes a list of any type and returns it as a new list
//    with the elements in reverse order.
    public static <T> List<T> reverseList(List<T> originalList){
        List<T> reversedList = new ArrayList<>();
//        Collections.reverse(originalList);
//        return reversedList;
        for (int i = originalList.size() - 1; i >= 0; i--) {
            reversedList.add(originalList.get(i));
        }

        return reversedList;
    }

    public static void main(String[] args) {
        List < Integer > numbers = List.of(1, 2, 3, 4, 5);
        List < String > colors = List.of("Red", "Green", "Blue", "Orange", "White");
        List reversedColors = reverseList(colors);
        List reversedNumbers = reverseList(numbers);
        System.out.println(numbers);
        System.out.println(reversedNumbers);
        System.out.println(colors);
        System.out.println(reversedColors);
    }
}
