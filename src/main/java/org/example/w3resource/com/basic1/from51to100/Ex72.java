package org.example.w3resource.com.basic1.from51to100;

import java.util.Scanner;

public class Ex72 {
    //    Write a Java program to create a string taking the first three characters from a given string.
//    If the string length is less than 3 use "#" as substitute characters.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me some word: ");
        String string = scanner.nextLine();
        String word2 = "#";
        if (string.length()>=3){
            System.out.println(string.substring(0,3));
        }else if (string.length()==2){
            System.out.println(string+word2);
        } else if (string.length()==1) {
            System.out.println(string+word2+word2);
        }else {
            System.out.println(word2+word2+word2);
        }
    }
}
