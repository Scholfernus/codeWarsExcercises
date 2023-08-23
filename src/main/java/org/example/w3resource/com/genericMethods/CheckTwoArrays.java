package org.example.w3resource.com.genericMethods;

import java.util.Arrays;

public class CheckTwoArrays {
    public static <T> boolean compare(T[] array1, T[] array2) {
        if (array1.length != array2.length) {
            return false;
        }
        for (int i = 0; i < array1.length; i++) {
            if (!array1[i].equals(array2[i])) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Integer[] array1 = {4, 5, 6, 7, 8, 9};
        Integer[] array2 = {1, 2, 3, 4, 5, 6};
        Integer[] array3 = {1, 2, 3, 4};
        String[] arr4 = {"Java", "World"};
        String[] arr5 = {"JavaScript", "World"};
        String[] arr6 = {"Java", "World"};
        System.out.println("Original arrays:");
        System.out.println("arr1: " + Arrays.toString(array1));
        System.out.println("arr2: " + Arrays.toString(array2));
        System.out.println("arr3: " + Arrays.toString(array3));
        System.out.println("arr4: " + Arrays.toString(arr4));
        System.out.println("arr5: " + Arrays.toString(arr5));
        System.out.println("arr6: " + Arrays.toString(arr6));
        System.out.println("\nCompare arr1 and arr2: " + compare(array1, array2)); //false
        System.out.println("Compare arr1 and arr3: " + compare(array1, array3));
        System.out.println("Compare arr4 and arr5: " + compare(arr4, arr5)); //false
        System.out.println("Compare arr4 and arr6: " + compare(arr4, arr6)); //true


    }
}
