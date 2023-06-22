package org.example.bingChat;

public class DoesStringContainsString {
    public static void main(String[] args) {
        String str = "Java jest językiem programowania";
        String word = "programowania";
        if (str.endsWith(word)){
            System.out.println("Zdanie:\n" + str + " zawiera słowo: " + word);
        }else {
            System.out.println("Zdanie:\n" + str + " nie zawiera słowa: " + word);
        }
    }
}
