package org.example.codeWars;

public class GetMiddleCharacter {
    public static void main(String[] args) {
        System.out.println(getMiddle("middle"));
    }

    public static String getMiddle(String word) {
        if (word.length() % 2 == 0) {
            return word.substring((((word.length() / 2) - 1)), (word.length() / 2) + 1);
        } else {
            return word.substring(word.length() / 2, (word.length() / 2 + 1));
        }
    }
}

//  int length = word.length();
//  return (length % 2 != 0) ?  String.valueOf(word.charAt(length / 2)) : word.substring(length / 2 - 1, length / 2 + 1);

// int l = word.length();
// return word.substring(l / 2 - (1 - l % 2), l / 2 + 1);