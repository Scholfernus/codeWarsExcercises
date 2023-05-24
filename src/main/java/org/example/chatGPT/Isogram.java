package org.example.chatGPT;

public class Isogram {
    public static void main(String[] args) {

    }
    public static boolean isIsogram(String str) {
        return str.toLowerCase().chars().distinct().count() == str.length();
    }
}
