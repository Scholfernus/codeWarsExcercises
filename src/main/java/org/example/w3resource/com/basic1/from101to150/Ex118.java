package org.example.w3resource.com.basic1.from101to150;

import java.util.Scanner;

public class Ex118 {
    //    Write a Java program to get the first occurrence (Position starts from 0.) of a string within a given string
    public static void main(String[] args) {
        String given = "Zadanie polega na napisaniu programu w języku Java, który znajdzie pierwsze wystąpienie " +
                "(pozycja zaczyna się od 0.) określonego ciągu znaków w danym ciągu znaków. Innymi słowy, " +
                "program powinien zlokalizować, na którym indeksie (licząc od 0) " +
                "w danym ciągu znaków rozpoczyna się pierwsze wystąpienie określonego podciągu znaków.";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Jakiego słowa szukasz? ");
        String findString = scanner.nextLine();
        int index = given.indexOf(findString);
        if (index != -1) {
            System.out.println("Pierwsze wystąpienie słowa zaczyna się na indeksie: " + index);
        } else {
            System.out.println("Słowo nie zostało znalezione w danym ciągu.");
        }
    }
}
