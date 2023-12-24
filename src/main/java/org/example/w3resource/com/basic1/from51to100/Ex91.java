package org.example.w3resource.com.basic1.from51to100;

public class Ex91 {
    //    Write a Java program to measure how long code executes in nanoseconds.
    public static void main(String[] args) {
        long start = System.nanoTime();
        int i;
        System.out.println("The first 10 natural numbers are:\n");
        for (i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        long end = System.nanoTime()-start;
        System.out.println("Estimated time (in nanoseconds) to get the first 10 natural numbers: " + end + " nanoseconds.");
    }
}
