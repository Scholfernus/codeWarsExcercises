package org.example.w3resource.com.exceptions.exercises;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex3 {
    //    Write a Java program to create a method that reads a file and throws an exception if the file is not found.
    public static void main(String[] args) {
        try {
            checkWord("Test.txt");
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
    public static void checkWord(String word) throws FileNotFoundException {
        File file = new File(word);
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()) {
            String nextLine = scanner.nextLine();
            System.out.println(nextLine);
        }
        scanner.close();
    }
}
