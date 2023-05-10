package org.example.chatGPTanotherExc;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exc5WriteLongWords {
    // Napisz program, który pobiera od użytkownika listę napisów i
    // wypisuje na ekran wszystkie napisy, które mają długość większą niż średnia długość wszystkich napisów.
    public static void main(String[] args) {
        Scanner words = new Scanner(System.in);
        System.out.println("Podaj 6 słów: ");
        List<String> listOfWords = new ArrayList<>();
        List<Integer> count = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            listOfWords.add(words.nextLine());
        }
        for (var elem : listOfWords) {
            count.add(elem.length());
        }
        int suma = 0;
        int middle = 0;
        for (int i = 0; i < count.size(); i++) {
            suma += count.get(i);
        }
        middle = suma / count.size();
        for (int i = 0; i < listOfWords.size(); i++) {
            if (listOfWords.get(i).length() > middle){
                System.out.println(listOfWords.get(i));
            }
        }
    }
}
