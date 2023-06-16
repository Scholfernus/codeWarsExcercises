package org.example.bingChat;

import java.util.Scanner;

public class IsPalindrom2Version {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj dowolne słowo: ");
        String word = scanner.nextLine();
        StringBuilder sb = new StringBuilder(word); // tworzymy obiekt klasy StringBuilder z podanego słowa
        sb.reverse(); // odwracamy kolejność znaków w obiekcie
        String reversed = sb.toString(); // zamieniamy obiekt na String
        boolean isPalindrom = word.equals(reversed); // porównujemy oryginalne i odwrócone słowo
        System.out.printf("Czy słowo %s jest palindromem? %b", word, isPalindrom);
    }
}


