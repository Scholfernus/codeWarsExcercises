package org.example.w3resource.com.recursiveMethods.exercises;

public class Ex15 {
    //    Write a Java recursive method to check if a given array is sorted in ascending order.
    public static void main(String[] args) {
        int[] numb1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] numb2 = {6, 5, 4, 3, 2, 1};
    }
    public static boolean isSorted(int[]numbers, int index){
        if (index== numbers.length-1){
            return true;
        }
        if (numbers[index] > numbers[index + 1]) {
            return false;
        }

        return isSorted(numbers, index + 1);
    }
}
