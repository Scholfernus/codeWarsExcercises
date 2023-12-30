package org.example.w3resource.com.basic1.from101to150;

public class Ex124 {
    //    Write a Java program to find the index of a value in a sorted array. If the value does not find return the
//    index where it would be if it were inserted in order.
//[1, 2, 4, 5, 6] 5(target) -> 3(index)
//[1, 2, 4, 5, 6] 0(target) -> 0(index)
//[1, 2, 4, 5, 6] 7(target) -> 5(index)
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6};
        int target1 = 5;
        int target2 = 0;
        int target3 = 3;
        for (int i = 0; i < numbers.length; i++) {
            if (target1 == numbers[i]) {
                System.out.println("Number 5 is under index: " + i);
            }

        }
        for (int i = 0; i < numbers.length; i++) {
            if (target2 == numbers[i]) {
                System.out.println("Number 0 is under index: " + i);
            }
        }
        for (int i = 0; i < numbers.length; i++) {
            if (target3 == numbers[i]) {
                System.out.println("Number 3 is under index: " + i);
            }
        }
    }
}
