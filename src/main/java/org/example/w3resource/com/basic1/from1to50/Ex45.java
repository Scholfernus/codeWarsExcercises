package org.example.w3resource.com.basic1.from1to50;

import java.io.File;

public class Ex45 {
    // Write a Java program to find the size of a specified file.
    public static void main(String[] args) {
        // Display the file sizes in bytes for two files.
        System.out.println("/home/students/abc.txt  : " + new File("abc.txt").length() + " bytes");
        System.out.println("/home/students/test.txt : " + new File("test.txt").length() + " bytes");
    }
}
