package org.example.chatGPT;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.Scanner;

public class ChatGPTExcercise9 {

    public static void main(String[] args) {
         int sum = 0;
        System.out.println("Podaj 10 dowolnych liczb całkowitych:");
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        Arrays.sort(numbers);
        System.out.println(sum+ " " + numbers[0] + " " + numbers[numbers.length-1]);
    }
}
