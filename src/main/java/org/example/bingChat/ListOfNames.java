package org.example.bingChat;

import java.util.ArrayList;
import java.util.Scanner;

public class ListOfNames {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Anna");
        names.add("Tomasz");
        names.add("Katarzyna");
        names.add("Piotr");
        names.add("Magdalena");
        System.out.println("Lista imion: ");
        System.out.println(names);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj imię, które chciałbyś usuną ć z listy:");
        String name = scanner.nextLine();
        if (names.contains(name)){
            System.out.println("Imię " + name + " znajduje się na liście.");
            System.out.println("Usuwanie imienia z listy...");
            names.remove(name);
            System.out.println("Lista imion: ");
            System.out.println(names);
        }else {
            System.out.println("Imię " + name + " nie znajduje się na liście.");
            System.out.println("Koniec programu.");
        }


    }
}
