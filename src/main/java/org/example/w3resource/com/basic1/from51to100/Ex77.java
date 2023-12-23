package org.example.w3resource.com.basic1.from51to100;

public class Ex77 {
    //    Write a Java program to create an array of length 2 from two integer arrays with three elements.
//    The newly created array will contain the first and last elements from the two arrays.
    public static void main(String[] args) {
        int[] numb = {50, -20, 0,};
        int[] numb2 = {40, -10, 30};
        int[] numb3 = new int[2];
        numb3[0] = numb[0];
        numb3[1] = numb2[numb2.length - 1];
        for (int elem : numb3) {
            System.out.print(elem + ",");
        }
    }
}
