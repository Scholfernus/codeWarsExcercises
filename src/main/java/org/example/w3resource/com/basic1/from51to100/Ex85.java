package org.example.w3resource.com.basic1.from51to100;

import java.util.Scanner;

public class Ex85 {
    //    Write a Java program to check if a string starts with a specified word
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj dowolne słowo, którego używasz na powitanie: ");
        String string = scanner.nextLine();
        boolean hello = string.startsWith("Hello");
        System.out.println(hello);
    }
}
