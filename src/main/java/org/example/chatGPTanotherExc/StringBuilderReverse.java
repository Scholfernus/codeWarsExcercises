package org.example.chatGPTanotherExc;

import java.util.Scanner;

public class StringBuilderReverse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj wyraz: ");
        String nextLine = input.nextLine();

        StringBuilder sb = new StringBuilder(nextLine);
        StringBuilder reverse = sb.reverse();
        System.out.println(reverse);
    }
}
