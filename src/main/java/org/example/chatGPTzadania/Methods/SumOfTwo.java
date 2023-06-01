package org.example.chatGPTzadania.Methods;


import org.example.chatGPTanotherExc.StringBuilderReverse;

public class SumOfTwo {
    public static int[] numbers = {2, 9, 4, -8, 15, -7, 10, -2, 33};
    public static String[] words = {"To", "jest", "zlepek", "kilku", "słów", "które", "może", "stworzyć", "zdanie", "."};

    public static void main(String[] args) {
        System.out.println(sum(5, 8));
        System.out.println(theBiggest(3, -4, 15));
        System.out.println(longCount("Napisz metodę, która przyjmuje jako argument napis (String) i zwraca jego długość"));
        System.out.println(sumOfArray(numbers));
        System.out.println(writing(words));
    }


    //Napisz metodę, która przyjmuje jako argumenty dwie liczby i zwraca ich sumę.
    public static int sum(int one, int two) {
        return one + two;
    }
    //Napisz metodę, która przyjmuje jako argumenty trzy liczby i zwraca największą z nich

    public static int theBiggest(int one, int two, int three) {
        return Math.max(Math.max(one, two), three);
    }

    //Napisz metodę, która przyjmuje jako argument napis (String) i zwraca jego długość.
    public static int longCount(String writeSthg) {
        return writeSthg.length();
    }

    // Napisz metodę, która przyjmuje jako argument tablicę liczb całkowitych i zwraca sumę wszystkich elementów tablicy.
    public static int sumOfArray(int[] numbers) {
        int sum = 0;
        for (int item : numbers) {
            sum += item;
        }
        return sum;
    }

    // Napisz metodę, która przyjmuje jako argument tablicę napisów (String[]) i zwraca napis składający się z wszystkich elementów tablicy, oddzielonych spacją.
    public static String writing(String[] elements) {
        StringBuilder sb = new StringBuilder();
        int lastIndex = elements.length - 1;
        for (int i = 0; i < elements.length-1; i++) {
            String currentElement = elements[i];
            if (i == lastIndex) {
                sb.append(currentElement);
            } else {
                sb.append(currentElement).append(" ");
            }
        }
        return sb.toString();
    }
}