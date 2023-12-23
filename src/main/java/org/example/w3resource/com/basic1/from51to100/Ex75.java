package org.example.w3resource.com.basic1.from51to100;

public class Ex75 {
    //    Write a Java program to test if the first and last elements of an array of integers are the same.
//    The array length must be broader than or equal to 2.
    public static void main(String[] args) {
        int[] numb = {50, -20, 0, 30, 40, 60, 10};
        int[] numb2 = {50, -20, 0, 30, 40, 60, 50};
        boolean a = theSame(numb);
        boolean b = theSame(numb2);
        System.out.println(a);
        System.out.println(b);
    }

    public static boolean theSame(int[] numbers) {
        return (numbers[0] == numbers[numbers.length - 1]);
    }
}
