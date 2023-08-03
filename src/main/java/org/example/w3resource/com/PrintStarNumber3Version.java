package org.example.w3resource.com;

public class PrintStarNumber3Version {
    public static void main(String[] args) {
        int k = 1;
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(k++ + " ");
            }
            System.out.println();
        }
    }
}

// Write a Java program to make such a pattern like a right angle triangle with the number increased by 1.
//
//The pattern like :
//
//1
//2 3
//4 5 6
//7 8 9 10