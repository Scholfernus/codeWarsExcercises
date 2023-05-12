package org.example.chatGPT_IO;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ConcatFiles {
    public static void main(String[] args) {
        File inputFile1 = new File("c:\\Data\\console.txt");
        File inputFile2 = new File("c:\\Data\\newFile.txt");
        File outputFile = new File("c:\\Data\\output.txt");
        try {
            Scanner scanner = new Scanner(inputFile1);
            FileWriter fileWriter = new FileWriter(outputFile);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                fileWriter.write(line + "\n");
            }
            scanner.close();
            fileWriter.close();

            scanner = new Scanner(inputFile2);
            fileWriter = new FileWriter(outputFile, true);
            while (scanner.hasNextLine()){
                String line2 = scanner.nextLine();
                fileWriter.write(line2 + "\n");
            }
                scanner.close();
            fileWriter.close();
        } catch (IOException e) {
            System.out.println("Nie udało się utworzyć pliku");
        }

    }
}

