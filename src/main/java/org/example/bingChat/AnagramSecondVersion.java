package org.example.bingChat;

public class AnagramSecondVersion {
    public static void main(String[] args) {
        System.out.println(isAnagram("masło", "słoma"));
    }

    public static boolean isAnagram(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        } else {
            // usuń białe znaki z obu stringów
            s1 = s1.replace("\\s", "");
            s2 = s2.replace("\\s", "");
            // sprawdź, czy długości stringów są równe
            for (int i = 0; i < s1.length(); i++) {
                char c = s1.charAt(i);
                int index = s2.indexOf(c);
                if (index != -1) {
                    s2 = s2.substring(0, index) + s2.substring(index + 1);
                } else {
                    return false;
                }

            }
            return s2.isEmpty();
        }
    }
}
