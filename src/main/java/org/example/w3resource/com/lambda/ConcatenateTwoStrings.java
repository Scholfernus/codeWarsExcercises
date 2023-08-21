package org.example.w3resource.com.lambda;

import java.util.function.BiFunction;

public class ConcatenateTwoStrings {
    public static void main(String[] args) {
        String str1 = "Hello ";
        String str2 = "friend";
        String concat = str1.concat(str2);
        System.out.println(concat);
        BiFunction<String, String, String> concatenate = ConcatenateTwoStrings::apply;
        String result = apply(str1,str2);
        System.out.println(result);
    }


    private static String apply(String str1, String str2) {
        return str1 + str2;
    }
}
