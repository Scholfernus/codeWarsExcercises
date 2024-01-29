package org.example.w3resource.com.interfaceClass.exercises;

import java.util.ArrayList;

public class Ex4 {
    //    Write a Java programming to create a banking system with three classes - Bank, Account, SavingsAccount,
//    and CurrentAccount. The bank should have a list of accounts and methods for adding them. Accounts should be
//    an interface with methods to deposit, withdraw, calculate interest, and view balances. SavingsAccount and
//    CurrentAccount should implement the Account interface and have their own unique methods.
    public static void main(String[] args) {

    }
}
class Bank{
    ArrayList<Konto>accounts;
}
interface Konto {

     void deposit(double cash);
     void withDraw(double cash);
    double getBalance();
}
    class SavingsAccount implements Konto{

        @Override
        public void deposit(double cash) {

        }

        @Override
        public void withDraw(double cash) {

        }

        @Override
        public double getBalance() {
            return 0;
        }
    }
class CurrentAccount implements Konto{
    private double balance;
    private double overdraftLimit;
    @Override
    public void deposit(double cash) {

    }

    @Override
    public void withDraw(double cash) {

    }

    @Override
    public double getBalance() {
        return 0;
    }
}