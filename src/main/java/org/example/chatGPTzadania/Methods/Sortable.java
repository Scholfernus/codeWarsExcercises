package org.example.chatGPTzadania.Methods;

import java.util.Arrays;

public interface Sortable {
    void sort(int[] array);
}

class IntegerArraySorter implements Sortable {
    public static void main(String[] args) {
        int[] numbers = {5, 2, 8, 1, 9, -4};
        Sortable sorter = new IntegerArraySorter();
        sorter.sort(numbers);

        System.out.println("Posortowana tablica:");
        for (int number : numbers) {
            System.out.println(number + " ");
        }
        System.out.println();
    }

    @Override
    public void sort(int[] array) {
        Arrays.sort(array);
    }
}