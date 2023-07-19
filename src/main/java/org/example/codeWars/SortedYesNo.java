package org.example.codeWars;

public class SortedYesNo {
    public static void main(String[] args) {
        int[] array = new int[]{15, 7, 3, -8};
        int[] array2 = new int[]{4, 2, 30};
        System.out.println(isSortedAndHow(array));
        System.out.println(isSortedAndHow(array2));
    }

    public static String isSortedAndHow(int[] array) {
        boolean ascending = true;
        boolean descending = true;
        for (int i = 0; i < array.length-1; i++) {
            if (array[i] < array[i + 1]) {
                descending = false;
            } else if (array[i] > array[i + 1]) {
                ascending = false;
            }
        }
        if (ascending){
            return "yes, ascending";
        }
        else if (descending){
            return "yes, descending";
        }else {
            return "no";
        }
    }
}
