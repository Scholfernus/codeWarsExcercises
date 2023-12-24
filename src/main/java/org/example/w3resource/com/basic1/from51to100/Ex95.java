package org.example.w3resource.com.basic1.from51to100;

public class Ex95 {
//    Write a Java program to create an array (length # 0) of string values.
//    The elements will contain "0", "1", "2" … through ... n-1.
    public static void main(String[] args) {
        int n = 5; // Możesz zmienić wartość 'n' na dowolną inną liczbę całkowitą

        String[] stringArray = new String[n];

        for (int i = 0; i < n; i++) {
            stringArray[i] = String.valueOf(i);
        }

        // Wyświetlanie zawartości tablicy
        for (String element : stringArray) {
            System.out.print(element + " ");
        }
    }
}
