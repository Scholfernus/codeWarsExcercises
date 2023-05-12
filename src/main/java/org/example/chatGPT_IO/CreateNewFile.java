package org.example.chatGPT_IO;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CreateNewFile {
    public static void main(String[] args) {

        File file = new File("c:\\Data\\newFile.txt");
        try {
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write("Oto zawartość pliku newFile.txt - idziemy na całość");
            fileWriter.close();
        } catch (IOException e) {
            System.out.println("Nie udało się utworzyć pliku");
            e.printStackTrace();
        }

    }
}
