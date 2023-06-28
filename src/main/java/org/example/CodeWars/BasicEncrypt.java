package org.example.CodeWars;

public class BasicEncrypt {
    public static void main(String[] args) {
        System.out.println(encrypt("please encrypt me", 2));
    }

    public static String encrypt(String text, int rule) {
        StringBuilder sb = new StringBuilder();
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            char origChar = text.charAt(i);
            char encrChar = (char) ((origChar + rule) % 256);
            sb.append(encrChar);
        }
        return sb.toString();
    }
}
