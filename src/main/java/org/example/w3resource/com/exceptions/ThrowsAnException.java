package org.example.w3resource.com.exceptions;

public class ThrowsAnException {
    public static void main(String[] args) {
        int divide = 3;
        int[] numbers = {1, 3, 6, 0, 5, 8, 9};
        try {
            for (int number : numbers) {
                int i1 = divide / number;
                System.out.println("Wynik dzielenia " + divide +
                        " przez " + number + " to " + i1);
            }
        } catch (ArithmeticException e) {
            System.out.println("Nie można dzielić przez 0:" + e.getMessage());
        }
    }
}

class Exception_Example {
    public static void main(String[] args) {
        try {
            int result = divideNumbers(5, 0);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    public static int divideNumbers(int dividend, int divisor) {
        if (divisor == 0) {
            throw new ArithmeticException("Cannot divide the given number by zero!");
        }
        return dividend / divisor;
    }
}