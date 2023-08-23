package org.example.w3resource.com.lambda;

import java.util.ArrayList;
import java.util.List;

public class FindLengthOfLongestSmallestString {
    public static void main(String[] args) {
        List<String>words = new ArrayList<>(List.of("Write","Java","program", "implement","lambda",
                "expression", "find", "the", "second", "largest","smallest", "element","in","array"));
        int maxLength = words.stream().mapToInt(String::length).max().orElse(0);
        int minLength = words.stream().mapToInt(String::length).min().orElse(0);
        System.out.println(maxLength);
        System.out.println(minLength);
    }
}
