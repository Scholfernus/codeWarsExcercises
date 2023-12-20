package org.example.w3resource.com.basic1;

public class Ex37 {
    // Write a Java program to reverse a string.
    //Input Data:
    //Input a string: The quick brown fox
    public static void main(String[] args) {
        String phrase = "The quick brown fox";
        StringBuilder builder = new StringBuilder(phrase);
        StringBuilder reverse = builder.reverse();
        String reverseString = reverse.toString();
        System.out.println(reverseString);
    }
}
