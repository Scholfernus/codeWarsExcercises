package org.example.w3resource.com.recursiveMethods.exercises;

import java.util.Scanner;

public class Ex10 {
    //    Write a Java recursive method to find the length of a given string.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj dowolne słowo: ");
        String string = scanner.nextLine();
        int lengthOfWord = length(string);
        System.out.println(lengthOfWord);
    }

    private static int length(String word) {
        int lengthOfWord = word.length();
        return lengthOfWord;
    }
}
//if (str.isEmpty()) {
//      return 0;
//    }
//    // Recursive case: remove the first character of the
//    // string and recursively call the method
//    // with the remaining substring, and add 1 to the length
//    return 1 + calculateStringLength(str.substring(1));
//  }