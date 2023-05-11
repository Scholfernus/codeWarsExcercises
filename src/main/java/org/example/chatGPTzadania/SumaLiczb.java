package org.example.chatGPTzadania;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SumaLiczb {
    // ten kod nie działa prawidłowo
    public static void main(String[] args) {
        System.out.println("Podaj dowolną liczbę kilkucyfrową, a policzę sumę liczb: ");
        Scanner input = new Scanner(System.in);
        int suma = 0;
        try{

            int number = input.nextInt();
            String s = String.valueOf(number);
            char[] array = s.toCharArray();
            for (var elem : array) {
                int value = Character.getNumericValue(elem);
                suma +=value;
            }
            System.out.println(suma);
        }catch (InputMismatchException e){
            System.out.println("Błąd: Podana wartość nie jest liczbą całkowitą.");
        }
    }
}
