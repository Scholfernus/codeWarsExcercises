package org.example.bingChat.password;

import java.util.Random;
import java.util.Scanner;

public class BingChatSolution {
    public static void main(String[] args) {
        // Zdefiniuj zmienne przechowujące znaki w postaci łańcuchów
        String lowerCaseLetters = "abcdefghijklmnopqrstuvwxyz";
        String upperCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String digits = "0123456789";
        String specialCharacters = "!@#$%^&*()_+-=[]{};':\",./<>?\\|`~";

        // Utwórz obiekt klasy Random do losowania znaków
        Random random = new Random();

        // Utwórz obiekt klasy Scanner do wczytywania danych od użytkownika
        Scanner scanner = new Scanner(System.in);

        // Poproś użytkownika o podanie długości hasła
        System.out.print("Podaj długość hasła: ");
        int passwordLength = scanner.nextInt();

        // Poproś użytkownika o podanie poziomu złożoności hasła
        System.out.println("1: Hasło złożone tylko z małych liter.\n" +
                "2: Hasło złożone z małych i dużych liter.\n" +
                "3: Hasło żłożone z małych, dużych liter i liczb.\n" +
                "4: Hasło żłożone z małych, dużych liter i liczb oraz znaków specjalnych. ");
        System.out.print("Podaj poziom złożoności hasła (1-4): ");
        int passwordDifficulty = scanner.nextInt();

        // Sprawdź, czy podane dane są poprawne
        if (passwordLength <= 0 || passwordDifficulty < 1 || passwordDifficulty > 4) {
            // Jeśli nie, to wyświetl komunikat i zakończ program
            System.out.println("Podałeś nieprawidłowe dane.");
            return;
        }

        // Utwórz zmienną przechowującą wszystkie dostępne znaki w zależności od poziomu złożoności hasła
        String availableChars = "";

        if (passwordDifficulty == 1) {
            // Jeśli poziom złożoności hasła to 1, to dostępne są tylko małe litery
            availableChars = lowerCaseLetters;
        } else if (passwordDifficulty == 2) {
            // Jeśli poziom złożoności hasła to 2, to dostępne są małe i duże litery
            availableChars = lowerCaseLetters + upperCaseLetters;
        } else if (passwordDifficulty == 3) {
            // Jeśli poziom złożoności hasła to 3, to dostępne są małe, duże litery i cyfry
            availableChars = lowerCaseLetters + upperCaseLetters + digits;
        } else {
            // Jeśli poziom złożoności hasła to 4, to dostępne są małe, duże litery, cyfry i znaki specjalne
            availableChars = lowerCaseLetters + upperCaseLetters + digits + specialCharacters;
        }

        // Utwórz tablicę znaków o długości równej długości hasła
        char[] password = new char[passwordLength];

        // W pętli losuj znaki z dostępnych znaków i dodawaj je do tablicy hasła
        for (int i = 0; i < passwordLength; i++) {
            // Losuj indeks znaku z zakresu od 0 do długości dostępnych znaków - 1
            int randomIndex = random.nextInt(availableChars.length());

            // Pobierz znak o wylosowanym indeksie z dostępnych znaków
            char randomChar = availableChars.charAt(randomIndex);

            // Przypisz znak do tablicy hasła na pozycji i
            password[i] = randomChar;
        }

        // Wyświetl wygenerowane hasło na ekranie
        System.out.println("Wygenerowane hasło: " + new String(password));
    }
}


