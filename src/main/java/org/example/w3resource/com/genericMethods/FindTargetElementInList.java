package org.example.w3resource.com.genericMethods;

import java.util.List;
import java.util.Objects;

public class FindTargetElementInList {
    public static <T> int findFirsOccurrence(List<T>elements,T target){
        for (int i = 0; i < elements.size(); i++) {
         if (elements.get(i).equals(target)){
             return i;
         }
        }
        return -1;
    }
    public static void main(String[] args) {
        List<String> colors = List.of("Red", "Blue", "Yellow", "Green");
        List<Integer> numbers = List.of(1, 3, 4, 6, 7, 10);
        System.out.println("Original list elements: ");
        System.out.println("Nums: " + numbers);
        System.out.println("Colors: " + colors);

        int index1 = findFirsOccurrence(numbers, 3);
        System.out.println("\nIndex of 3 in numbers: " + index1);
        int index2 = findFirsOccurrence(numbers, 8);
        System.out.println("Index of 8 in numbers: " + index2);

        int index3 = findFirsOccurrence(colors, "Black");
        System.out.println("Index of \"Black\" in colors: " + index3);

        int index4 = findFirsOccurrence(colors, "Yellow");
        System.out.println("Index of \"Yellow\" in colors: " + index4);

    }
}
