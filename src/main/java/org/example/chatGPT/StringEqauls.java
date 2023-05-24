package org.example.chatGPT;

public class StringEqauls {
    public static void main(String[] args) {
        System.out.println(solution("samurai", "ai"));
    }
    public static boolean solution(String str, String ending) {
        return str.endsWith(ending);
    }
}
