package org.example.codeWars;

public class IncrementString {
    public static void main(String[] args) {
        System.out.println(incrementString("foobar002"));
    }
    public static String incrementString(String str) {
            char numb = 1;
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (i ==chars.length-1){
                chars[i]+=numb;
            }else break;
            str = chars.toString();
        }
        return str;
    }
}

// ten kod jest nieprawidłowy, nie działa poprawnie
