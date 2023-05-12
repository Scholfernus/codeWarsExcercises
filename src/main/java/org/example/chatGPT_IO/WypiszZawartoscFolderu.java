package org.example.chatGPT_IO;

import java.io.File;
import java.util.Scanner;

public class WypiszZawartoscFolderu {
    public static void main(String[] args) {
        System.out.println("Podaj ścieżkę do folderu:");
        //String path = System.console().readLine();
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();

        File folder = new File(path);

        if (!folder.isDirectory()) {
            System.out.println("Podana ścieżka nie prowadzi do folderu.");
            return;
        }
        File[] files = folder.listFiles();
        for (File file : files) {
            System.out.println(file.getName());
        }
    }
}
