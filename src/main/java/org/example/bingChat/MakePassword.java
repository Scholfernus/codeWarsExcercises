package org.example.bingChat;

import java.security.SecureRandom;
import java.util.Random;
import java.util.Scanner;

public class MakePassword {
    public static Random secureRandom = new SecureRandom();
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println(password(5));
    }

    public static String password(int number) {
        System.out.println("Podaj długość hasła: ");
        String rdm = "";
        number = scanner.nextInt();
        if (number < 8 || number > 32) {
            System.out.println("Błędna długość hasła. Spróbuj ponownie.");
            return "";
        }
        //int[]numbersPassword = new int[number];
        for (int i = 0; i < number; i++) {
            char c = (char) secureRandom.nextInt((94) + 32);
            rdm += c;
        }
        return String.valueOf(rdm);
    }
}
