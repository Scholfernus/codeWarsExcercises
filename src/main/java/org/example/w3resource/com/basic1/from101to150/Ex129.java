package org.example.w3resource.com.basic1.from101to150;

public class Ex129 {
    //    Write a Java program to find a number that appears only once in a given array of integers. All numbers occur twice.
//Source Array : [10, 20, 10, 20, 30, 40, 40, 30, 50] 50 appears only once
    public static void main(String[] args) {
        int singleNumber2 = 0;
        int[] numbers = {10, 20, 10, 20, 30, 40, 40, 30, 50};
        for (int i = 0; i < numbers.length; i++) {
            boolean isSingle = true;
            for (int j = 0; j < numbers.length; j++) {
                if (i != j && numbers[i] == numbers[j]) {
                    isSingle = false;
                    break;
                }
            }
            if (isSingle) {
                singleNumber2 = numbers[i];
                break;
            }
        }
        System.out.println("Liczba, która występuje tylko raz: " + singleNumber2);
        int[] nums = {10, 20, 10, 50, 30, 40, 40, 30, 20};
        int singleNumber = findSingleNumber(nums);

        System.out.println("Source Array: " + java.util.Arrays.toString(nums));
        System.out.println(singleNumber + " appears only once.");
    }

    public static int findSingleNumber(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result ^= num;
        }
        return result;
    }
}
