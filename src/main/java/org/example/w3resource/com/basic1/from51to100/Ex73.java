package org.example.w3resource.com.basic1.from51to100;

import java.util.Scanner;

public class Ex73 {
    // Write a Java program to create a string taking the first and last characters from two given strings.
    // If the length of each string is 0 use "#" for missing characters.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me some first word: ");
        String string1 = scanner.nextLine();
        System.out.println("Give me second word: ");
        String string2 = scanner.nextLine();
        if (string1.length()==0){
            System.out.println("#"+string2.substring(string2.length()-1));
        } else if (string2.length()==0) {
            System.out.println(string1.substring(0,1)+"#");
        }else {
            System.out.println(string1.substring(0,1)+string2.substring(string2.length()-1));
        }
    }
}
