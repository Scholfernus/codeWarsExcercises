package org.example.w3resource.com.basic1.from51to100;

public class Ex70 {
    //    Write a Java program to create a string in the form of short_string + long_string + short_string
//    from two strings. The strings must not have the same length.
    public static void main(String[] args) {
        // Define two strings
        String str1 = "Python";
        String str2 = "Tutorial";

        // Check the lengths of the strings
        if (str1.length() >= str2.length()) {
            // Concatenate the strings in the order: str2 + str1 + str2
            System.out.println(str2 + str1 + str2);
        } else {
            // Concatenate the strings in the order: str1 + str2 + str1
            System.out.println(str1 + str2 + str1);
        }
    }
}
