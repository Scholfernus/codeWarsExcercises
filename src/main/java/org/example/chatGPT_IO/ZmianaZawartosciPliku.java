package org.example.chatGPT_IO;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ZmianaZawartosciPliku {
     // "c:\\Data\\console.txt"
     public static void main(String[] args) throws IOException {
         Scanner scanner = new Scanner(System.in);
         System.out.println("Podaj ścieżkę do pliku:");
         String filePath = scanner.nextLine();

         File file = new File(filePath);

         Scanner fileScanner = new Scanner(file);
         StringBuilder contentBuilder = new StringBuilder();
         while (fileScanner.hasNextLine()) {
             String line = fileScanner.nextLine();
             contentBuilder.append(line).append("\n");
             System.out.println(line);
         }
         fileScanner.close();

         System.out.println("Podaj nową zawartość pliku:");
         String newContent = scanner.nextLine();

         FileWriter fileWriter = new FileWriter(file);
         fileWriter.write(newContent);
         fileWriter.close();

         System.out.println("Zawartość pliku po zmianie:");

         System.out.println(contentBuilder.toString());
     }

}
