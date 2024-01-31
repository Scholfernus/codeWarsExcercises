package org.example.w3resource.com.encapsulation;

public class Ex2 {
    //    Write a Java program to create a class called BankAccount with private instance variables accountNumber and balance.
//    Provide public getter and setter methods to access and modify these variables.
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.setAccountNumber("SB-09876");
        account.setBalance(1000);

        String number = account.getAccountNumber();
        double balance = account.getBalance();

        System.out.println("Account Number: " + number);
        System.out.println("Balance: " + balance);
    }
}

class BankAccount {
    private String accountNumber;
    private double balance;

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}