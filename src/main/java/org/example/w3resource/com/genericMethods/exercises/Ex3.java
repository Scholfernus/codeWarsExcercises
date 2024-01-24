package org.example.w3resource.com.genericMethods.exercises;

import java.util.List;

public class Ex3 {
    //    Write a Java program to create a generic method that takes a list of any type and a target element.
//    It returns the index of the first occurrence of the target element in the list. Return -1 if the target element cannot be found.
    public static <T> int findIndexOfElement(List<T> any, T target) {
        for (int i = 0; i < any.size(); i++) {
            if (any.get(i).equals(target)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        List < Integer > numbers = List.of(1, 2, 3, 4, 5);
        List < String > colors = List.of("Red", "Green", "Blue", "Orange", "White");
        System.out.println("Original list elements:");
        System.out.println("Nums: " + numbers);
        System.out.println("Colors: " + colors);
        int numberIndex = findIndexOfElement(numbers, 4);
        System.out.println(numberIndex);
        int colorIndex = findIndexOfElement(colors, "black");
        System.out.println(colorIndex);
        int index2 = findIndexOfElement(numbers, 6);
        System.out.println("Index of 6 in numbers: " + index2);
        int index3 = findIndexOfElement(colors, "Green");
        System.out.println("Index of \"Green\" in colors: " + index3);
    }
}
