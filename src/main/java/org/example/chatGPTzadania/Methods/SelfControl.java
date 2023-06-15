package org.example.chatGPTzadania.Methods;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SelfControl {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();
        System.out.println("Podaj dowolne liczby całkowite: ");
        while (scanner.hasNextInt()){
            int number = scanner.nextInt();
            numbers.add(number);
        }
        System.out.println(numbers);
    }
}
