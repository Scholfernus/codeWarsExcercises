package org.example.w3resource.com.basic1.from51to100;

import java.util.Scanner;

public class Ex69 {
    //  Write a Java program to extract the first half of a even string
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Put some word: ");
        String word = scanner.nextLine();
        int cut = word.length() / 2;
        System.out.println(word.substring(0, cut));
    }
}
