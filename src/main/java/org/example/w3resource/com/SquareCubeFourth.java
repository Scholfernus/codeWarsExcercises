package org.example.w3resource.com;

import java.util.Scanner;

public class SquareCubeFourth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj dowolną liczbę: ");
        double number = scanner.nextDouble();
        double square = number * number;
        double cube = number * number * number;
        double fourth = square * square;
        System.out.println("Kwadrat " + square + " do trzeciej potęgi " + cube + " do potęgi czwartej " + fourth);
        System.out.printf("Square: %12.2f\n", square);
        System.out.printf("Cube: %15.2f\n", cube);
        System.out.printf("Fourth power: %6.2f\n", Math.pow(number, 4));
    }
}

//        import java.util.Scanner;
//        public class Exercise8 {
//
//        public static void main(String[] args)
//       {
//        Scanner in = new Scanner(System.in);
//        System.out.print("Input the side length value: ");
//        double val = in.nextDouble();
//
//        System.out.printf("Square: %12.2f\n", val * val);
//        System.out.printf("Cube: %14.2f\n", val * val * val);
//        System.out.printf("Fourth power: %6.2f\n", Math.pow(val, 4));
//        }
//        }

// Write a Java program that reads a number and displays the square, cube, and fourth power.
//
//Test Data
//Input the side length value: 15