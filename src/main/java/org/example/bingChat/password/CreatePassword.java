package org.example.bingChat.password;

import java.util.Random;
import java.util.Scanner;

public class CreatePassword {
    public static void main(String[] args) {
        String lowerCaseLetters = "abcdefghijklmnopqrstuvwxyz";
        String upperCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String digits = "0123456789";
        String specialCharacters = "!@#$%^&*()_+-=[]{};':\",./<>?\\|`~";
        String allChars = lowerCaseLetters + upperCaseLetters + digits + specialCharacters;
        char[] password = allChars.toCharArray();
        int length = password.length;

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj długość hasła: ");
        int passwordLength = scanner.nextInt();
        System.out.println("1: Hasło złożone tylko z małych liter.\n" +
                "2: Hasło złożone z małych i dużych liter.\n" +
                "3: Hasło żłożone z małych, dużych liter i liczb.\n" +
                "4: Hasło żłożone z małych, dużych liter i liczb oraz znaków specjalnych. ");
        System.out.print("Podaj poziom złożoności hasła (1-4): ");
        int passwordDifficulty = scanner.nextInt();
        if (passwordLength < 1 || passwordDifficulty < 1 || passwordDifficulty > 4) {
            System.out.println("Podałeś nieprawidłową liczbę.");
            return;
        }
        char[] password2 = new char[passwordLength];

        for (int i = 0; i < password2.length; i++) {
            if (passwordDifficulty == 1) {
                password2[i] = (char) ((char) 97 + random.nextInt(25));
            } else if (passwordDifficulty == 2) {
                password2[i] = password[random.nextInt(51)];
            } else if (passwordDifficulty == 3) {
                password2[i] = password[random.nextInt(61)];
            } else {
                password2[i] = password[random.nextInt(95)];
            }
        }

        System.out.print("Wygenerowane hasło: " + password2);
    }
}

