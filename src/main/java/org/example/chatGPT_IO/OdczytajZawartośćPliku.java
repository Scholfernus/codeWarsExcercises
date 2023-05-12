package org.example.chatGPT_IO;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class OdczytajZawartośćPliku {
    // c:\\Data\\console.txt
    public static void main(String[] args) {
        System.out.println("Podaj ścieżkę do pliku tekstowego:");
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();
        File plik = new File(path);
        try {
            Scanner file = new Scanner(plik);
            while (file.hasNextLine()) {
                String line = file.nextLine();
                System.out.println(line);
            }
            file.close();
        } catch (FileNotFoundException e) {
            System.out.println("Nie udało się otworzyć pliku");
            e.printStackTrace();
        }
    }

}
