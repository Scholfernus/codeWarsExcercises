package org.example.w3resource.com.basic1;

public class Ex67 {
    //    Write a Java program to insert a word in the middle of another string.
//Insert "Tutorial" in the middle of "Python 3.0", so the result will be Python Tutorial 3.0.
    public static void main(String[] args) {
        String temp = "Python 3.0";
        String add = " Tutorial";
        String string1 = temp.substring(6);
        String string2 = temp.substring(0, 6);
        System.out.println(string2 + add + string1);
    }
}
