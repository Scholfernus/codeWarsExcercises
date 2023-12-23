package org.example.w3resource.com.basic1.from1to50;

public class Ex38 {
    // Write a Java program to count letters, spaces, numbers and other characters in an input string.
    // The string is: Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33
    // letter: 23, space: 9, number: 10, other: 6
    public static void main(String[] args) {
        String checkWord = "Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33";
        int letters = countLetters(checkWord);
        int spaces = countSpaces(checkWord);
        int numbers = countNumbers(checkWord);
        int others = countOthers(checkWord);

        System.out.println("Letter count: " + letters);
        System.out.println("Space count: " + spaces);
        System.out.println("Number count: " + numbers);
        System.out.println("Other count: " + others);
    }

    private static int countLetters(String word) {
        int letterCounter = 0;
        for (int i = 0; i < word.length(); i++) {
            char currentChar = word.charAt(i);
            if (Character.isLetter(currentChar)) {
                letterCounter++;
            }
        }
        return letterCounter;
    }

    private static int countSpaces(String word) {
        int spaceCounter = 0;
        for (int i = 0; i < word.length(); i++) {
            char currentChar = word.charAt(i);
            if (Character.isWhitespace(currentChar)) {
                spaceCounter++;
            }
        }
        return spaceCounter;
    }

    private static int countNumbers(String word) {
        int numberCounter = 0;
        for (int i = 0; i < word.length(); i++) {
            char currentChar = word.charAt(i);
            if (Character.isDigit(currentChar)) {
                numberCounter++;
            }
        }
        return numberCounter;
    }

    private static int countOthers(String word) {
        int otherCounter = 0;
        for (int i = 0; i < word.length(); i++) {
            char currentChar = word.charAt(i);
            if (!Character.isLetterOrDigit(currentChar) && !Character.isWhitespace(currentChar)) {
                otherCounter++;
            }
        }
        return otherCounter;
    }
}

