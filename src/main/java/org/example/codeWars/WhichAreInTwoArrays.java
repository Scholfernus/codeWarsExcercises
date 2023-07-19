package org.example.codeWars;

import java.util.Arrays;

public class WhichAreInTwoArrays {
    public static String[] inArray(String[] array1, String[] array2) {
        String[] result = new String[array1.length + array2.length];
        int index = 0;
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array2[j].contains(array1[i])) {
                    result[index++] = array1[i];
                    break;
                }
            }
        }
        result = Arrays.copyOf(result, index);
        Arrays.sort(result);

        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(inArray(new String[]{"arp", "live", "strong"},
                new String[]{"lively", "alive", "harp", "sharp", "armstrong"})));
    }
}

// return Arrays.stream(array1)
//      .filter(str ->
//        Arrays.stream(array2).anyMatch(s -> s.contains(str)))
//      .distinct()
//      .sorted()
//      .toArray(String[]::new);