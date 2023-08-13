package org.example.w3resource.com.array;

import java.util.Arrays;
import java.util.HashSet;

public class FindCommonStringsBetweenTwoArrays {
    public static void main(String[] args) {
        String[] word1 = {"eye", "leg", "nose", "hair", " finger"};
        String[] word2 = {"face", "elbow", "nose", "front", " foot"};
        findString(word1, word2);
    }

    public static void findString(String[] a, String[] b) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i].equalsIgnoreCase(b[j])) {
                    System.out.println("Similar word = " + b[j]);
                }
            }
        }
    }
}

class exercise14 {
    public static void main(String[] args) {
        String[] array1 = {"Python", "JAVA", "PHP", "C#", "C++", "SQL"};

        String[] array2 = {"MySQL", "SQL", "SQLite", "Oracle", "PostgreSQL", "DB2", "JAVA"};

        System.out.println("Array1 : " + Arrays.toString(array1));
        System.out.println("Array2 : " + Arrays.toString(array2));
        HashSet<String> set = new HashSet<String>();
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i].equals(array2[j])) {
                    set.add(array1[i]);
                }
            }
        }
        System.out.println("Common element : " + (set));
    }
}