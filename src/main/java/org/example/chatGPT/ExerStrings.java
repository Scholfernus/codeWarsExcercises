package org.example.chatGPT;

import java.util.Scanner;

public class ExerStrings {
    public static void main(String[] args) {
        ExerStrings exercise = new ExerStrings();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Napisz dowolne zdanie, obliczę jego długość.");
        String nextLine = scanner.nextLine();

        int i = exercise.writingLength(nextLine);
        System.out.printf("Zdanie ma %d znaki.\n",i);

        System.out.println("Napisz kolejne zdanie, zmienię jego litery na wielkie.");
        String toUp = scanner.nextLine();
        String letUp = exercise.letterUp(toUp);
        System.out.println("Zdanie z wielkimi literami:\n" + letUp);

        System.out.println("Napisz kolejne zdanie, zmienię jego litery na wielkie.");
        String toDown = scanner.nextLine();
        String letDown = exercise.letterDown(toDown);
        System.out.println("Zdanie z małymi literami:\n" + letDown);
    }
    public int writingLength(String text){
        return text.length();
    }
    public String letterUp(String text1){
        return text1.toUpperCase();
    }
    public String letterDown(String text1){
        return text1.toLowerCase();
    }
}
