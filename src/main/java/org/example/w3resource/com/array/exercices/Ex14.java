package org.example.w3resource.com.array.exercices;

public class Ex14 {
    //    Write a Java program to find common elements between two arrays (string values).
    public static void main(String[] args) {
        String[] words = {"koko", "bebe", "cece", "didi", "mama"};
        String[] words2 = {"kiki", "bubu", "caca", "dada", "mama", "koko"};
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words2.length; j++) {
                if (words[i].equals(words2[j])) {
                    System.out.print(words[i] + " -> słowo wspólne\n");
                }
            }
        }
    }
}
