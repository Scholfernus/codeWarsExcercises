package org.example.w3resource.com.array;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateElementsFromArray {
    public static void main(String[] args) {
        int[] numb = {1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 2, 3, 5, 8, 10};
        for (int i = 0; i < numb.length; i++) {
            System.out.print(numb[i] + "\t");
        }
        System.out.println();
        removeDuplicates(numb);
    }

    public static void removeDuplicates(int[] array) {
        Set<Integer> numbers = new HashSet<>();
        for (int i = 0; i < array.length; i++) {
            numbers.add(array[i]);
        }
        System.out.println(numbers);
    }
}
