package org.example.w3resource.com.objectOrientedProgramming.exercises;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

public class Ex7 {
//    Write a Java program to create a class called "Account" with a collection of accounts and methods to add and
//    remove accounts, and to deposit and withdraw money. Also define a class called "Account" to maintain account
//    details of a particular customer.

    public static void main(String[] args) {
    Bank bank = new Bank();
    Account acc1 = new Account("Kovalsky","123456789", 550.50);
    Account acc2 = new Account("Novak","987654321", 1000.50);
    Account acc3 = new Account("Yanik","456321789", 300.25);

    acc1.deposit(acc1.getBalance());
    bank.addAccount(acc1);
    bank.addAccount(acc2);
    bank.addAccount(acc3);
    ArrayList<Account> accounts = bank.getAccounts();
        for (Account acc: accounts) {
            System.out.println(acc);
        }
        System.out.println("\nAfter depositing 1000 into account1:");
        bank.depositMoney(acc1,1000);
        System.out.println(acc1);
        bank.withDrawMoney(acc3,250);
        System.out.println(acc3);
        bank.withDrawMoney(acc3,50);
        System.out.println(acc3);
    }
}

@Getter
@Setter
@AllArgsConstructor
class Account {
    private String name;
    private String accountNumber;
    private double balance;

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (balance<100){
            System.out.println("Operation is blocked, you've enough money");
        }else {
            balance -= amount;
        }
    }

    @Override
    public String toString() {
        return "Account{" +
                "name='" + name + '\'' +
                ", accountNumber='" + accountNumber + '\'' +
                ", balance=" + balance +
                '}';
    }

    public void addAccount() {

    }
}
@Getter
@Setter
@AllArgsConstructor
class Bank {
    private final ArrayList<Account> accounts = new ArrayList<Account>();

    public void addAccount(Account acc) {
        accounts.add(acc);
    }
    public void removeAccount(Account acc){
        accounts.remove(acc);
    }
    public void depositMoney(Account ac, double money){
        ac.deposit(money);
    }
    public void withDrawMoney(Account ac, double money){
        ac.withdraw(money);
    }
}