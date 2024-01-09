package org.example.w3resource.com.exceptions.exercises;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex4 {
    //    Write a Java program that reads a list of numbers from a file and throws an exception if any of the numbers
//    are positive.
    public static void main(String[] args) {
        try {
            File file = new File("Numbers.txt");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                int number = Integer.parseInt(scanner.nextLine());
                if (number > 0) {
                    throw new Exception("Positive number found: " + number);
                }
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
