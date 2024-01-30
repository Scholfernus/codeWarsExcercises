package org.example.w3resource.com.interfaceClass.exercises;

import java.util.ArrayList;

public class Ex4 {
    //    Write a Java programming to create a banking system with three classes - Bank, Account, SavingsAccount,
//    and CurrentAccount. The bank should have a list of accounts and methods for adding them. Accounts should be
//    an interface with methods to deposit, withdraw, calculate interest, and view balances. SavingsAccount and
//    CurrentAccount should implement the Account interface and have their own unique methods.
    public static void main(String[] args) {
        Bank bank = new Bank();
        SavingsAccount savingsAccount = new SavingsAccount(1000.0, 1.25);
        System.out.println("Savings Account:\nInitial Deposit: $1000.00\nInterest rate: 1.25%");

        CurrentAccount currentAccount = new CurrentAccount(5000.0, 1000.0);
        System.out.println("\nCurrent Account:\nInitial Deposit: $5000.00\nOverdraft Limit: $1000.00");

        bank.addAccount(savingsAccount);
        bank.addAccount(currentAccount);

        System.out.println("\nNow deposit $100 to Savings Account.");
        // Deposit $100 into the SavingsAccount
        bank.deposit(savingsAccount, 100.0);
        System.out.println("Now deposit $500 to Current Account.");
        // Deposit $500 into the CurrentAccount
        bank.deposit(currentAccount, 500.0);

        System.out.println("Withdraw $150 from Savings Account.\n");
        // Withdraw $150 from the SavingsAccount
        bank.withdraw(savingsAccount, 150.0);
        System.out.println("\nSavings A/c and Current A/c.:");

        // Print the balances of all accounts in the bank
        bank.printAccountBalances();

        // Apply interest to the SavingsAccount
        savingsAccount.applyInterest();
        System.out.println("\nAfter applying interest on Savings A/c for 1 year:");
        System.out.println("Savings A/c and Current A/c.:");

        // Print the balances of all accounts in the bank after applying interest
        bank.printAccountBalances();

    }
}

class Bank {
    ArrayList<Konto> accounts;

    public Bank() {
        this.accounts = accounts;
    }

    public void addAccount(Konto account) {
        accounts.add(account);
    }

    public void removeAccount(Konto account) {
        accounts.remove(account);
    }

    public void deposit(Konto account, double amount) {
        account.deposit(amount);
    }

    public void withdraw(Konto account, double amount) {
        account.withdraw(amount);
    }

    public void printAccountBalances() {
        for (Konto account : accounts) {
            System.out.println("Account balance: " + account.getBalance());
        }
    }
}

interface Konto {

    void deposit(double cash);

    void withdraw(double cash);

    double getBalance();
}

class SavingsAccount implements Konto {
    private double balance;
    private double interestRate;

    public SavingsAccount(double balance, double interestRate) {
        this.balance = balance;
        this.interestRate = interestRate;
    }

    @Override
    public void deposit(double cash) {
        balance += cash;
    }

    @Override
    public void withdraw(double cash) {
        balance -= cash;
    }

    @Override
    public double getBalance() {
        return balance;
    }

    public void applyInterest() {
        // Applying interest rate (in percentage) to the balance for 1 year
        balance += balance * interestRate / 100;
    }
}

class CurrentAccount implements Konto {
    private double balance;
    private double overdraftLimit;

    public CurrentAccount(double balance, double overdraftLimit) {
        this.balance = balance;
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void deposit(double cash) {
        balance += cash;
    }

    @Override
    public void withdraw(double cash) {
        if (balance + overdraftLimit >= cash) {
            balance -= cash;
        }
    }

    @Override
    public double getBalance() {
        return balance;
    }

    // Method to set the overdraft limit for the current account
    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }
}