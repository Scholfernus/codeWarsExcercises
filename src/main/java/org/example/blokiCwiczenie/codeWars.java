package org.example.blokiCwiczenie;

import java.util.Arrays;
import java.util.stream.IntStream;


public class codeWars {
    public static void main(String[] args) {
        System.out.println(longest("loopingisfunbutdangerous", "lessdangerousthancoding"));
        System.out.println(longest1("xyaabbbccccdefww", "xxxxyyyyabklmopq"));
        System.out.println(findMissingLetter(new char[] { 'a','b','c','d','f' }));
        System.out.println(findMissingLetter(new char[] { 'O','Q','R','S' }));
        System.out.println(findMissingLetter2(new char[] { 'a','b','c','d','f' }));
    }

    public static Double multiply(Double a, Double b) {
        return a * b;
    }

    // find the smallest number
    public static int findSmallestInt(int[] args) {
        // return Arrays.stream(args).min().orElse(Integer.MAX_VALUE);
        // return IntStream.of(args).min().getAsInt();
        Arrays.sort(args);
        return args[0];
    }

    // Take 2 strings s1 and s2 including only letters from a to z.
    // Return a new sorted string, the longest possible,
    // containing distinct letters - each taken only once - coming from s1 or s2.
    public static String longest(String s1, String s2) {
        String s = s1 + s2;
        StringBuilder sb = new StringBuilder();
        for (char i = 'a'; i <= 'z'; i++) {
            if (s.indexOf(i) != -1) {
                sb.append(i);
            }
        }
        return sb.toString();
    }

    public static String longest1(String s3, String s4) {
        return (s3 + s4)
                .chars()
                .distinct()
                .sorted()
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();
    }
    // find length of array, without n 5
    public static int dontGiveMeFive(int start, int end) {
        int count = 0;
        for (int i = start; i <= end; i++) {
            if (!String.valueOf(i).contains("5")) {
                count++;
            }
        }
        return count;
    }
    // find missing char in char-array
    public static char findMissingLetter(char[] array)
    {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i + 1] - array[i] > 1) {
                return (char) (array[i] + 1);
            }
        }
        return ' ';
    }
    public static char findMissingLetter2(char[] array) {

        char start = array[0];
        for (char c: array) {
            if (start != c) return start;
            start++;
        }
        return ' ';
    }

}
