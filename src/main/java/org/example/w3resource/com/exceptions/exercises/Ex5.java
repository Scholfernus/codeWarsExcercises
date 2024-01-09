package org.example.w3resource.com.exceptions.exercises;

import org.example.w3resource.com.exceptions.FileEmptyException;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex5 {
    //    Write a Java program that reads a file and throws an exception if the file is empty.
    public static void main(String[] args) {
        try {
            File file = new File("Text.txt");
            Scanner scanner = new Scanner(file);
            if (!scanner.hasNextLine()) {
            scanner.close();
            throw new FileEmptyException("File is empty");
            }
        } catch (FileEmptyException e) {
            System.out.println(e.getMessage());
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
