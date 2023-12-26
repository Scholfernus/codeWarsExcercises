package org.example.w3resource.com.basic1.from101to150;

import java.util.Arrays;

public class Ex113 {
    //    Write a Java program to merge two given sorted arrays of integers and create another sorted array.
//array1 = [1,2,3,4]
//array2 = [2,5,7, 8]
//result = [1,2,2,3,4,5,7,8]
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4};
        int[] array2 = {2, 5, 7, 8};
        int[] array3 = new int[array1.length + array2.length];

        for (int i = 0, j = 0, k = 0; i < array1.length || j < array2.length; ) {
            if (i < array1.length && (j == array2.length || array1[i] < array2[j])) {
                array3[k++] = array1[i++];
            } else {
                array3[k++] = array2[j++];
            }
        }

        System.out.println(Arrays.toString(array3));
//         int[] array1 = {1, 2, 3, 4};
//        int[] array2 = {2, 5, 7, 8};
//        int[] array3 = new int[array1.length + array2.length];
//
//        int i = 0, j = 0, k = 0;
//
//        while (i < array1.length || j < array2.length) {
//            if (i < array1.length && (j == array2.length || array1[i] < array2[j])) {
//                array3[k++] = array1[i++];
//            } else {
//                array3[k++] = array2[j++];
//            }
//        }
//
//        System.out.println(Arrays.toString(array3));


//        int[] array1 = {1, 2, 3, 4};
//        int[] array2 = {2, 5, 7, 8};
//        int[] array3 = new int[array1.length + array2.length];
//
//        int i = 0, j = 0, k = 0;
//
//        while (i < array1.length && j < array2.length) {
//            array3[k++] = (array1[i] < array2[j]) ? array1[i++] : array2[j++];
//        }
//
//        // Copy the remaining elements from both arrays (if any)
//        System.arraycopy(array1, i, array3, k, array1.length - i);
//        System.arraycopy(array2, j, array3, k, array2.length - j);
//
//        System.out.println(Arrays.toString(array3));
    }
}
