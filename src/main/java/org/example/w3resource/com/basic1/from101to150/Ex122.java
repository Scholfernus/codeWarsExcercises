package org.example.w3resource.com.basic1.from101to150;

public class Ex122 {
    //    Write a Java program to find a contiguous subarray with the largest sum from a given array of integers.
//Note: In computer science, the maximum subarray problem is the task of finding the contiguous subarray
// within a one-dimensional array of numbers which has the largest sum. For example,
// for the sequence of values −2, 1, −3, 4, −1, 2, 1, −5, 4; the contiguous subarray with the
// largest sum is 4, −1, 2, 1, with sum 6. The subarray should contain one integer at least.
    public static int maxSubarraySum(int[] nums) {
        int maxEndingHere = nums[0];
        int maxSoFar = nums[0];

        for (int i = 1; i < nums.length; i++) {
            maxEndingHere = Math.max(nums[i], maxEndingHere + nums[i]);
            maxSoFar = Math.max(maxSoFar, maxEndingHere);
        }

        return maxSoFar;
    }
    public static void main(String[] args) {
    int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int result = maxSubarraySum(nums);
        System.out.println("Maximum subarray sum: " + result);
    }
}
