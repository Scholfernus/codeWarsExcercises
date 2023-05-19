package org.example.chatGPT;

import java.util.Scanner;

public class ExerStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Napisz dowolne zdanie, obliczę jego długość.");
        String nextLine = scanner.nextLine();
        ExerStrings exercise = new ExerStrings();
        int i = exercise.writingLength(nextLine);
        System.out.printf("Zdanie ma %d znaki.",i);
    }
    public int writingLength(String text){
        int length = text.length();
        return length;
    }
}
