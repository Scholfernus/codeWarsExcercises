package org.example.CodeWars;

public class LimitNumber {
    public static void main(String[] args) {
        int[] numbers = {66, 101, 201, 199, 303, 200};
        int limit = 200;
        System.out.println(smallEnough(numbers, limit));
    }

    public static boolean smallEnough(int[] a, int limit) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] >= limit) {
                return true;
            }
        }
        return false;
    }
}
