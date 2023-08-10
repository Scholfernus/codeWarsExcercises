package org.example.w3resource.com.exceptions;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class ReadsFileAndThrowsAnException {
    public static void main(String[] args) {
        String firstWord = "Hello";
        findWord(firstWord);
        firstWord = "Goodbye";
        findWord(firstWord);
    }
    private static void findWord(String firstWord) {
        try {
            String word = "Goodbye";
            if (!firstWord.equals(word)) {
                System.out.println("Nie ma takiego słowa.");
            }

        } catch (IllegalArgumentException e) {
            System.out.println("Error " + e.getMessage());
        }
    }
}
class File_Read {
    public static void main(String[] args) {
        try {
            readFile("test1.txt");
        } catch (FileNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    public static void readFile(String fileName) throws FileNotFoundException {
        File file = new File(fileName);
        Scanner scanner = new Scanner(file);

        // Read and process the contents of the file
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            System.out.println(line);
        }

        scanner.close();
    }
}



