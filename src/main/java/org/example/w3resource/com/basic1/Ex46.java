package org.example.w3resource.com.basic1;

import java.time.LocalDateTime;

public class Ex46 {
    // Write a Java program to display system time.
    public static void main(String[] args) {
        System.out.println(LocalDateTime.now());
        System.out.format("\nCurrent Date time: %tc%n\n",System.currentTimeMillis());
    }
}
