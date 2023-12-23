package org.example.w3resource.com.basic1.from51to100;

public class Ex86 {
    //    Write a Java program starting with an integer n, divide it by 2 if it is even, or multiply it by 3 and add 1
//    if it is odd. Repeat the process until n = 1
    public static void main(String[] args) {
        for (int i = 10; i >= 1; i--) {
            if (i % 2 == 0) {
                int divided = i / 2;
                System.out.print(divided+", ");
            }else {
                int multiply = i * 3 + 1;
                System.out.print(multiply + ", ");
            }
        }
    }
}
