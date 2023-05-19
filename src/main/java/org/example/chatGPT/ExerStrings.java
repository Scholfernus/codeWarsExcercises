package org.example.chatGPT;

import java.util.Scanner;

public class ExerStrings {
    public static void main(String[] args) {
        ExerStrings exercise = new ExerStrings();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Napisz dowolne zdanie, obliczę jego długość.");
        String nextLine = scanner.nextLine();

        int i = exercise.writingLength(nextLine);
        System.out.printf("Zdanie ma %d znaki.",i);

        System.out.println("Napisz kolejne zdanie, zmienię jego litery na wielkie.");
        String letterUp = exercise.letterUp(nextLine);
        System.out.println("Zdanie z wielkimi literami: " + letterUp);
    }
    public int writingLength(String text){
        int length = text.length();
        return length;
    }
    public String letterUp(String text){
        String toUpperCase = text.toUpperCase();
        return toUpperCase;
    }
}
