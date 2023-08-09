package org.example.w3resource.com.recursiveMethods;

import java.util.Arrays;

public class FindTheMaximumElementInArray {
    public static int maxElement(int[] array) {
        if (array.length == 0) {
            return 0;
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] array = {1, 3, 5, 9, 66, 12, 100, -7, 33};
        System.out.println("Maximum element of Array " + Arrays.toString(array) + " wynosi: " + maxElement(array));
    }
}

class ArrayMaxElementFinder {

    public static int findMaxElement(int[] arr) {
        return findMaxElement(arr, 0, arr.length - 1);
    }

    private static int findMaxElement(int[] arr, int left, int right) {
        // Base case: if the left and right indices are equal,
        // we have a single element and return it as the maximum
        if (left == right) {
            return arr[left];
        }

        // Recursive case: divide the array into two halves, recursively
        //find the maximum in each half,and return the greater of the
        // two maximums
        int mid = (left + right) / 2;
        int maxLeft = findMaxElement(arr, left, mid);
        int maxRight = findMaxElement(arr, mid + 1, right);

        return Math.max(maxLeft, maxRight);
    }

    public static void main(String[] args) {
        int[] array = {
                34,
                45,
                34,
                23,
                56,
                62,
                27,
                55
        };
        System.out.println("Original Array: " + Arrays.toString(array));
        int maxElement = findMaxElement(array);
        System.out.println("The maximum element in the array is: " + maxElement);
    }
}