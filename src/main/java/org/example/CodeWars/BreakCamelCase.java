package org.example.CodeWars;

public class BreakCamelCase {
    public static void main(String[] args) {
        System.out.println(camelCase("camelCasingTest"));
    }
    public static String camelCase(String input) {
            int numb = 0;
        char[] findBigLetter = input.toCharArray();
        for (int i = 0; i < findBigLetter.length; i++) {
            if (findBigLetter[i]<=65 || findBigLetter[i]<=90){
                numb = findBigLetter[i];
            }
        }
        return Integer.toString(numb);
    }
}
