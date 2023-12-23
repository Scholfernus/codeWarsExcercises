package org.example.w3resource.com.basic1.from51to100;

import java.util.Scanner;

public class Ex84 {
    //    Write a Java program to take the last three characters from a given string.
//    It will add the three characters at both the front and back of the string.
//    String length must be greater than three and more.
//    Test data: "Python" will be "honPythonhon"
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj dowolne słowo większe niż 3 litery");
        String string = scanner.nextLine();
        String newString = string.substring(string.length() - 3);
        System.out.println(newString+string+newString);
    }
}
