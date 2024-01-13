package org.example.w3resource.com.array.exercices;

public class Ex13 {
    //    Write a Java program to find duplicate values in an array of string values
    public static void main(String[] args) {
        String[] words = {"koko", "bebe", "cece", "didi", "mama", "bebe", "cece"};
        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].equals(words[j])) {
                    System.out.print(words[i] + ", ");
                }
            }
        }
    }
}
