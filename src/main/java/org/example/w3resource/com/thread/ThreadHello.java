package org.example.w3resource.com.thread;

public class ThreadHello extends Thread {
    @Override
    public void run(){
        System.out.println("Hello, World!");
    }
    public static void main(String[] args) {
        Thread invitation = new ThreadHello();
        invitation.run();
        invitation.start();
    }
}
