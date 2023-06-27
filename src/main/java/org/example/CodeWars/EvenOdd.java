package org.example.CodeWars;

public class EvenOdd {
    public static void main(String[] args) {
        System.out.println(simpleMultiplication(7));
    }

    public static int simpleMultiplication(int n) {
        if (n % 2 == 0) {
            return n * 8;
        } else {
            return n * 9;
        }
    }
}

//   return n % 2 == 0 ? n * 8 : n * 9;

//  return n * (n % 2 + 8);