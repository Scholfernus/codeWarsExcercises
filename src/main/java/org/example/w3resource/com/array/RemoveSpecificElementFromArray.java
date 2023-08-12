package org.example.w3resource.com.array;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveSpecificElementFromArray {
    public static void main(String[] args) {
        int[] numbers = {1, 5, 6, 8, 9, 4, 9, 12, 33, 25, 21, 1, 7};
        System.out.println("Original Array: " + Arrays.toString(numbers));
        int target = 4;
        removeElem(numbers, target);
        System.out.println("Modified Array: " + Arrays.toString(numbers));
    }

    public static void removeElem(int[] array, int number) {
        ArrayList<Integer> numbers = new ArrayList<>
                (Arrays.asList(Arrays.stream(array).boxed().toArray(Integer[]::new)));
        if (numbers.contains(number)) {
            numbers.remove(Integer.valueOf(number));
        }
        for (int i = 0; i < numbers.size(); i++) {
            array[i] = numbers.get(i);
        }
    }
}

class Exercise7 {

    public static void main(String[] args) {
        int[] my_array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};

        System.out.println("Original Array : " + Arrays.toString(my_array));

        // Remove the second element (index->1, value->14) of the array
        int removeIndex = 1;

        for (int i = removeIndex; i < my_array.length - 1; i++) {
            my_array[i] = my_array[i + 1];
        }
// We cannot alter the size of an array , after the removal, the last and second last element in the array will exist twice
        System.out.println("After removing the second element: " + Arrays.toString(my_array));
    }
}