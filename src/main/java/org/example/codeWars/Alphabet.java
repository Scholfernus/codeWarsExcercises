package org.example.codeWars;

public class Alphabet {
    public static void main(String[] args) {
        System.out.println(position('g'));
    }

    public static String position(char alphabet) {
        int value = Character.getNumericValue(alphabet);
        String s = String.valueOf(value - 9);
        return "Position of alphabet: " + s;
    }
}
