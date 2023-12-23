package org.example.w3resource.com.basic1.from51to100;

public class Ex78 {
    //    Write a Java program to test that a given array of integers of length 2 contains a 4 or a 7.
    public static void main(String[] args) {
        int[] numb = {7, 3};
        if (numb[0]==7 ||numb[1]==4 || numb[0]==4 ||numb[1]==7){
            System.out.println("Bingo!");
        }else {
            System.out.println("Dupa!");
        }
    }
}
