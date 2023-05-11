package org.example.chatGPTzadania;

import java.util.Arrays;

public class ReverseWords {
    public static void main(String[] args) {
        String test = "Oto zdanie do zamiany słów, kto próbuje? ";
        System.out.println(reverseWords(test));
        String test2 =  "Duży dom dla lalek";
        System.out.println(reverse2(test2));
    }
    public static String reverseWords(String str){
        String add = "";
        String[] split = str.split(" ");
        for (int i = split.length-1; i >0; i--) {
          add+= split[i] + " ";
        }
        return add;
    }
    public static String reverse2(String str){
        String[] strings = str.split(" ");
        StringBuilder reverseWords = new StringBuilder(strings[strings.length-1]);
        for (int i = strings.length-2; i >=0 ; i--) {
            reverseWords.append(" ").append(strings[i]);
        }
        return reverseWords.toString();
    }
}
