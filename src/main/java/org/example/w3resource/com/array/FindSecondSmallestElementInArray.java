package org.example.w3resource.com.array;

import java.util.Arrays;

public class FindSecondSmallestElementInArray {
    public static void main(String[] args) {
        int[] numbers = {2, 1, 45, 6, 4, 9, -12, 5, 12, 16, 11, 3, 7, 8, 100, -3, 6, 4, 2, 15};
        System.out.println(Arrays.toString(numbers));
        int secondSmall = secondSmall(numbers);
        System.out.println(secondSmall);
    }

    public static int secondSmall(int[] array) {
        Arrays.sort(array);
        int sec = 0;
        System.out.println(Arrays.toString(array));
        if (array.length >= 2) {  // Ensure there are at least two elements in the array
            sec = array[1];
        }
        return sec;
    }
}

class Exercise18 {
    public static void main(String[] args) {

        int[] my_array = {-1, 4, 0, 2, 7, -3};
        System.out.println("Original numeric array : "+Arrays.toString(my_array));
        int min = Integer.MAX_VALUE;
        int second_min = Integer.MAX_VALUE;
        for (int i = 0; i < my_array.length; i++) {
            if(my_array[i]==min){
                second_min=min;
            } else if (my_array[i] < min) {
                second_min = min;
                min = my_array[i];
            } else if (my_array[i] < second_min) {
                second_min = my_array[i];
            }

        }
        System.out.println("Second lowest number is : " + second_min);
    }
}