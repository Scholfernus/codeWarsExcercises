package org.example.kamilBrzezinski.fileManager;

public class Main {
    public static void main(String[] args) {
    FileManager fileManager = new FileManager();
    fileManager.listFilesInDirectory("/Users/Schol");
        System.out.println("||||||||||||||||||||||||||||||||||||||");
    fileManager.sortFilesInDirectoryAscending("/Users/Schol/Documen ts");
        System.out.println("|||||||||||||||||||||||||||||||||||||||");
    fileManager.sortFilesInDirectoryDescending("/Users/Schol/Documents");
    }
}
