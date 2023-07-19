package org.example.codeWars;

public class DzielenieMnozenie {
    public static boolean checkForFactor(int base, int factor) {
        return base % factor ==0;
    }
    public static void main(String[] args) {
        System.out.println(checkForFactor(3, 2));
    }
}
