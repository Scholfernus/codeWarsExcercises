package org.example.w3resource.com.recursiveMethods;

public class TheBiggestDivisor {
    public static int biggestDivisor(int a, int b, int c) {
        if (a % a == 0 || b % a == 0) {

            return a;
        } else if (a % c == 0 || b % c == 0) {
            return c;
        }
        return 0;
    }

    public static void main(String[] args) {
        int divisor = biggestDivisor(6, 9, 3);
        System.out.println(divisor);
    }
}

// Największy dzielnik
class GCDCalculator {

    public static int calculateGCD(int num1, int num2) {
        // Base case: if the second number is 0, the GCD is the first number
        if (num2 == 0) {
            return num1;
        }

        // Recursive case: calculate the GCD by recursively calling the method with num2 as the new num1 and the remainder as num2
        int remainder = num1 % num2;
        return calculateGCD(num2, remainder);
    }

    public static void main(String[] args) {
        int number1 = 7;
        int number2 = 28;
        int gcd = calculateGCD(number1, number2);
        System.out.println("The GCD of " + number1 + " and " + number2 + " is: " + gcd);
    }
}

