package org.example.chatGPTzadania;

public class ReversePhrase {
    public static void main(String[] args) {
    String test = "To jest wyraz, który będzie odwrócony za pomocą metody reverse:";
        System.out.println(reversePhrase(test));
    }
    public static String reversePhrase(String input){
        StringBuilder sb = new StringBuilder(input);
        StringBuilder reverse = sb.reverse();
        return reverse.toString();
    }
}
