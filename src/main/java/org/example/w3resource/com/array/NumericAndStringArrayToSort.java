
package org.example.w3resource.com.array;

import java.util.Arrays;
import java.util.stream.Stream;

public class NumericAndStringArrayToSort {
    public static void main(String[] args) {
        int[] numbers = {2, 33, -44, 5, 48, 99, 24, 1, 6, 8, 2, 7};
        String[] words = {"Arab", "European", "British", "Deutch", "Mexican"};
        Arrays.sort(numbers);
        Arrays.sort(words);
        System.out.println("Posortowana tablica liczb: " + Arrays.toString(numbers) + "\noraz posortowana tablica wyrazów: "
                + Arrays.toString(words));
    }
}