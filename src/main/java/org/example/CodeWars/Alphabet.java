package org.example.CodeWars;

public class Alphabet {
    public static void main(String[] args) {
        System.out.println(position('z'));
    }

    public static String position(char alphabet) {
        int value = Character.getNumericValue(alphabet);
        String s = String.valueOf(value - 9);
        return "Position of alphabet: " + s;
    }
}
