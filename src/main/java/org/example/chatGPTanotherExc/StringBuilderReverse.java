package org.example.chatGPTanotherExc;

import java.util.Scanner;

public class StringBuilderReverse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj wyraz: ");

        StringBuilder sb = new StringBuilder(input.nextLine());
        StringBuilder reverse = sb.reverse();
        System.out.println(reverse);
    }
}
