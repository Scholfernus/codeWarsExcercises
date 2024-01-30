package org.example.w3resource.com.interfaceClass.exercises;

public class Ex7 {
    //    Write a Java program to create an interface Sortable with a method sort() that sorts an array of integers in
//    ascending order. Create two classes BubbleSort and SelectionSort that implement the Sortable interface and
//    provide their own implementations of the sort() method.
    public static void main(String[] args) {
        int[] array = {4,2,0,3,1,6,8};
        Sortable bubbleSort = new BubbleSort();
        bubbleSort.sort(array);
        printArray(array);
        Sortable selectionSort = new SelectionSort();
        selectionSort.sort(array);
        printArray(array);
        }
    private static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

interface Sortable {
    void sort(int[] array);
}

class BubbleSort implements Sortable {

    @Override
    public void sort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}

class SelectionSort implements Sortable {
    @Override
    public void sort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i;
            // Inner loop to find the minimum element in the unsorted part of the array
            for (int j = i + 1; j < array.length-1; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            // Swap arr[i] and arr[minIndex]
            int temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }
    }
}
