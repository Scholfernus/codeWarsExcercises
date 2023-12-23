package org.example.w3resource.com.basic1.from51to100;

public class Ex68 {
    //    Write a Java program to create another string of 4 copies of the last 3 characters
//    of the original string. The original string length must be 3 and above.
    public static void main(String[] args) {
        // Define the main string
        String main = "Python 3.0";

        // Extract the last three characters from the main string
        String lastThreeChars = main.substring(main.length() - 3);

        // Repeat the last three characters four times and print the result
        System.out.println(lastThreeChars + lastThreeChars + lastThreeChars + lastThreeChars);
    }
}
