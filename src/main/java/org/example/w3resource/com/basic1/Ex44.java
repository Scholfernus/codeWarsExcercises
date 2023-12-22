package org.example.w3resource.com.basic1;

import java.util.Scanner;

public class Ex44 {
    // Write a Java program that accepts an integer (n) and computes the value of n+nn+nnn.
    //Input number: 5            5 + 55  + 555
    public static void main(String[] args) {
        int n;
        char s1, s2, s3;
        Scanner in = new Scanner(System.in);

        // Prompt the user to input a number.
        System.out.print("Input number: ");
        n = in.nextInt();

        // Display the number in a specific pattern.
        System.out.printf("%d + %d%d  + %d%d%d\n", n, n, n, n, n, n);
    }
}
