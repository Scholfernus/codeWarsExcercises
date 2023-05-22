package org.example.chatGPT;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherRegex {
    public static void main(String[] args) {
        System.out.println("Napisz dowlny adres e-mail: ");
        Scanner scanner = new Scanner(System.in);
        String emailRegex = "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$";
        String email = scanner.nextLine();
        Pattern pattern = Pattern.compile(emailRegex);
        Matcher matcher = pattern.matcher(email);
        boolean isValid = matcher.matches();
        if (isValid){
            System.out.println("Adres email jest poprawny");
        }else {
            System.out.println("Adres email jest niepoprawny");
        }
    }
}
