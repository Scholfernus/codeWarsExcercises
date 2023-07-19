package org.example.codeWars;

public class ArrayPlusArray {
    public static void main(String[] args) {
        System.out.println(arrayPlusArray(new int[]{1, 2, 3}, new int[]{4, 5, 6}));
    }

    public static int arrayPlusArray(int[] arr1, int[] arr2) {
        int sum = 0;
        for (int i = 0; i < arr1.length; i++) {
                sum += arr1[i] + arr2[i];
            }
        return sum;
    }
}

// return IntStream.of(arr1).sum() + IntStream.of(arr2).sum();

// return concat(stream(arr1),stream(arr2)).sum();