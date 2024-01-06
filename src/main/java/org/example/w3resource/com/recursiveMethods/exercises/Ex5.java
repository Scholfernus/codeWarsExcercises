package org.example.w3resource.com.recursiveMethods.exercises;

public class Ex5 {
    //    Write a Java recursive method to calculate the exponentiation of a number (base) raised to a power (exponent).
    public static void main(String[] args) {
        int base = 3;
        int exponent = 4;
        int result = calculateExponentiation(base, exponent);
        System.out.println(base + " ^ " + exponent + " = " + result);
    }

    private static int calculateExponentiation(int base, int exponent) {
        if (exponent == 0) {
            return 1;
        }
        return base * calculateExponentiation(base, exponent - 1);
    }
}
