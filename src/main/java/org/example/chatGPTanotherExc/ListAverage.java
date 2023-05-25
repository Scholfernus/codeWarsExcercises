package org.example.chatGPTanotherExc;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListAverage {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj dowolne liczby, aby zakończyć wciśnij 0");

        String input = scanner.nextLine();
        String[] numberStrings = input.split(" ");

        for (String numberString : numberStrings) {
            int number = Integer.parseInt(numberString);
            if (number == 0) {
                break;
            }
            numbers.add(number);
        }
        System.out.println("Lista zawiera: " + numbers);
        int sum = 0;
        for (int n : numbers
        ) {
            sum += n;
        }
        System.out.println("Suma wynosi: " + sum);
        double average = (double) sum/numbers.size();
        System.out.println(average);
    }
}
