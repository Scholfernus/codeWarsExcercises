package org.example.w3resource.com.basic1.from101to150;

public class Ex116 {
    //    Write a Java program that iterates integers from 1 to 100. For multiples of three print
//    "Fizz" instead of the number and print "Buzz" for five.
//    When the number is divided by three and five, print "fizz buzz".
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print("fizz buzz " + i + ", ");
            } else if (i % 3 == 0) {
                System.out.print("Fizz " + i + ", ");
            } else if (i % 5 == 0) {
                System.out.print("Buzz " + i + ", ");
            } else {
                System.out.println("Nie spełnia warunku: " + i);
            }
        }
    }
}
