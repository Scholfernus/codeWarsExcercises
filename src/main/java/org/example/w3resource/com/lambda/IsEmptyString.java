package org.example.w3resource.com.lambda;

import java.util.function.Predicate;

public interface IsEmptyString {
    boolean isEmpty(String word);

    public static void main(String[] args) {
        IsEmptyString isEmptyString = String::isEmpty;
        boolean stringEmpty = isEmptyString.isEmpty("");
        System.out.println("Czy słowo jest puste ? " + stringEmpty);
        String str1 = "";
        String str2 = "Java lambda expression!";
        System.out.println("String 1:" + str1);
        System.out.println("String 1 is empty: " + isEmptyString.isEmpty(str1));
        System.out.println("\nString 2:" + str2);
        System.out.println("String 2 is empty: " + isEmptyString.isEmpty(str2));
    }
}
