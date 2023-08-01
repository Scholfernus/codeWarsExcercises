package org.example.w3resource.com;

import java.util.Scanner;

public class NumbersMathematics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj piewszą liczbę: ");
        int one = scanner.nextInt();
        System.out.print("Podaj drugą liczbę: ");
        int two = scanner.nextInt();
        int sum = one + two;
        int difference = one - two;
        double product = (one * 4) + (two * two);
        int average = sum / 2;
        int distance = one - two;
        int min = Math.min(one, two);
        int max = Math.max(one, two);

        System.out.println("Input 1st integer: " + one);
        System.out.println("Input 2nd integer: " + two);
        System.out.println("Sum of two integers: " + sum);
        System.out.println("Difference of two integers: " + difference);
        System.out.println("Product of two integers: " + product);
        System.out.println("Average of two integers: " + average);
        System.out.println("Distance of two integers: " + distance);
        System.out.println("Max integer: " + max);
        System.out.println("Min integer: " + min);
    }
}
// Write a Java program that accepts two integers from the user and prints the sum,
// the difference, the product, the average, the distance (the difference between the integers),
// the maximum (the largest of the two integers), and the minimum (the smallest of the two integers).//
//Test Data
//Input 1st integer: 25
//Input 2nd integer: 5
//Expected Output :
//Sum of two integers: 30
//Difference of two integers: 20
//Product of two integers: 125
//Average of two integers: 15.00
//Distance of two integers: 20
//Max integer: 25
//Min integer: 5


//        import java.util.Scanner;
//        public class Exercise9 {
//
//        public static void main(String[] args)
//    {
//        Scanner in = new Scanner(System.in);
//        System.out.print("Input 1st integer: ");
//        int firstInt = in.nextInt();
//        System.out.print("Input 2nd integer: ");
//        int secondInt = in.nextInt();
//
//        System.out.printf("Sum of two integers: %d%n", firstInt + secondInt);
//        System.out.printf("Difference of two integers: %d%n", firstInt - secondInt);
//        System.out.printf("Product of two integers: %d%n", firstInt * secondInt);
//        System.out.printf("Average of two integers: %.2f%n", (double) (firstInt + secondInt) / 2);
//        System.out.printf("Distance of two integers: %d%n", Math.abs(firstInt - secondInt));
//        System.out.printf("Max integer: %d%n", Math.max(firstInt, secondInt));
//        System.out.printf("Min integer: %d%n", Math.min(firstInt, secondInt));
//    }
//}