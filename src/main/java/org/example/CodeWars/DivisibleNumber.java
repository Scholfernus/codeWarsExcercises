package org.example.CodeWars;

public class DivisibleNumber {
    public static boolean isDivisible(long n, long x, long y) {
        boolean isIt = true;
        if (n % x == 0 && n % y == 0) {
            return isIt;
        } else {
            return !isIt;
        }
    }

    public static void main(String[] args) {
        System.out.println(isDivisible(12, 4, 3));
    }
}

// return n % x == 0 && n % y == 0 ? true : false;