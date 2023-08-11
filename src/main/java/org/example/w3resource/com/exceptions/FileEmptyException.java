package org.example.w3resource.com.exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileEmptyException extends Throwable {
    public static void main(String[] args) {
        try {
            fileEmpty("file.txt");
        }catch (FileEmptyException | FileNotFoundException e){
            System.out.println("Error: " + "file is empty");
        }
    }
    public static void fileEmpty(String fileName) throws FileEmptyException, FileNotFoundException {
        File file = new File(fileName);
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()){
            String line = scanner.nextLine();
            System.out.println(line);
        }
        scanner.close();
    }
}

class Empty_File_Check {
    public static void main(String[] args) {
        try {
            checkFileNotEmpty("test1.txt");
            System.out.println("File is not empty.");
        } catch (FileNotFoundException | EmptyFileException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void checkFileNotEmpty(String fileName) throws FileNotFoundException, EmptyFileException {
        File file = new File(fileName);
        Scanner scanner = new Scanner(file);

        if (!scanner.hasNextLine()) {
            scanner.close();
            throw new EmptyFileException("File is empty.");
        }

        scanner.close();
    }
}

class EmptyFileException extends Exception {
    public EmptyFileException(String message) {
        super(message);
    }
}