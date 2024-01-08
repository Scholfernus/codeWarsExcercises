package org.example.w3resource.com.exceptions.exercises;

public class Ex1 {
    //    Write a Java program that throws an exception and catch it using a try-catch block.
    public static void main(String[] args) {
        int a = 2;
        int b = 0;
        int sum = 0;
        int iloczyn = 0;
        int roznica = 0;
        try {
            sum = a + b;
            iloczyn = a * b;
            roznica = a - b;
            int divided = dividedNumbers(a, b);
            System.out.println(divided);
        } catch (ArithmeticException e) {
            System.out.println("Error "+e.getMessage());
            System.out.println(sum);
            System.out.println(roznica);
            System.out.println(iloczyn);
        }
    }
    public static int dividedNumbers(int dividend, int divisor){
        if (divisor==0){
            throw new ArithmeticException("Cannot divide the given number by zero!");
        }
        return dividend/divisor;
    }
}
