package org.example.w3resource.com.basic1.from101to150;

import java.util.Arrays;

public class Ex128 {
    //    Write a Java program to calculate the median of a non-sorted array of integers.
//Original array: [10, 2, 38, 22, 38, 23]
//Median of the said array of integers: 30
//Original array: [10, 2, 38, 23, 38, 23, 21]
//Median of the said array of integers: 23
    public static void main(String[] args) {
        int[] array1 = {10, 2, 38, 22, 38, 23};
        int[] array2 = {10, 2, 38, 23, 38, 23, 210};
        int sum = 0;
        int sum1 = 0;
        for (int i = 0; i < array1.length; i++) {
            sum += array1[i];
        }
        System.out.println("Średnia liczb z tablicy 1 = "+sum / array1.length);
        for (int i = 0; i < array2.length; i++) {
            sum1 += array2[i];
        }
        System.out.println("Średnia liczb z tablicy 2 = "+sum1 / array2.length);
        int[] nums1 = {10, 2, 38, 22, 38, 23};
        double median1 = calculateMedian(nums1);
        System.out.println("Original array: " + Arrays.toString(nums1));
        System.out.println("Median of the array: " + median1);

        int[] nums2 = {10, 2, 38, 23, 38, 23, 21};
        double median2 = calculateMedian(nums2);
        System.out.println("Original array: " + Arrays.toString(nums2));
        System.out.println("Median of the array: " + median2);
    }

    public static double calculateMedian(int[] nums) {
        Arrays.sort(nums);

        int length = nums.length;
        if (length % 2 == 0) {
            // Jeśli liczba elementów jest parzysta, medianę uzyskuje się jako średnią dwóch środkowych liczb.
            int mid1 = length / 2 - 1;
            int mid2 = length / 2;
            return (nums[mid1] + nums[mid2]) / 2.0;
        } else {
            // Jeśli liczba elementów jest nieparzysta, medianą jest środkowa liczba.
            int mid = length / 2;
            return nums[mid];
        }
    }
}
