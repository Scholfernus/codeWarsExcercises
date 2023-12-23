package org.example.w3resource.com.basic1.from51to100;

public class Ex61 {
    // Write a Java program to reverse a word.
    public static void main(String[] args) {
        String word = "elcyciB";
        StringBuilder stringBuilder = new StringBuilder(word);
        StringBuilder reversed = stringBuilder.reverse();
        System.out.println(reversed);
    }
}
