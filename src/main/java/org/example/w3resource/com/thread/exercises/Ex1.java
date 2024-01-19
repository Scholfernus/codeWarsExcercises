package org.example.w3resource.com.thread.exercises;

public class Ex1 extends Thread {
    //    Write a Java program to create a basic Java thread that prints "Hello, World!" when executed.
    @Override
    public void run() {
        System.out.println("Hello, World");
    }

    public static void main(String[] args) {
        Ex1 thread = new Ex1();
        thread.start();
    }
}
