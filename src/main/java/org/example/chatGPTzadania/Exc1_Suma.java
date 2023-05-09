package org.example.chatGPTzadania;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exc1_Suma {
    public static void main(String[] args) {
        List<Integer> userNumbers = new ArrayList<>();
        Scanner inputNumber = new Scanner(System.in);
        System.out.println("Podaj 10 dowolnych liczb: ");
        int suma = 0;
        double srednia = 0;
        for (int i = 0; i < 10; i++) {
            userNumbers.add(inputNumber.nextInt());
        }
        for (int e : userNumbers) {
            suma += e;
        }
        srednia = (double)suma/userNumbers.size();
        System.out.println(suma + " " + srednia);
    }
}
