package org.example.chatGPT;

import java.util.Scanner;
// Wyświetla długość napisu.
//Wyświetla napis zapisany wielkimi literami.
//Wyświetla napis zapisany małymi literami.
//Wyświetla pierwszą literę napisu.
//Wyświetla ostatnią literę napisu.
public class ExerStrings {
    public static void main(String[] args) {
        ExerStrings exercise = new ExerStrings();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Napisz dowolne zdanie, obliczę jego długość.");
        int i = exercise.writingLength(scanner.nextLine());
        System.out.printf("Zdanie ma %d znaki.\n",i);

        System.out.println("Napisz kolejne zdanie, zmienię jego litery na wielkie.");
        String toUp = scanner.nextLine();
        String letUp = exercise.letterUp(toUp);
        System.out.println("Zdanie z wielkimi literami:\n" + letUp);

        System.out.println("Napisz kolejne zdanie, zmienię jego litery na małe.");
        String letDown = exercise.letterDown(scanner.nextLine());
        System.out.println("Zdanie z małymi literami:\n" + letDown);
        String firstLetter = exercise.firstLetter(scanner.nextLine());
        System.out.println("Podaj zdanie, a wyświetlę 1-szą literę:");
        System.out.println("Zadanie z pierwszą literą zdania:\n" + firstLetter);
        System.out.println("Podaj zdanie, a wyświetlę ostatnią literę:");
        String lastLetter = exercise.lastLetter(scanner.nextLine());
        System.out.println("Zadanie z ostatnią literą zdania:\n" + lastLetter);
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
    public String firstLetter(String text1){
        return text1.substring(0,1);
    }
    public String lastLetter (String text1){
        return text1.substring(text1.length()-1);
    }

}
