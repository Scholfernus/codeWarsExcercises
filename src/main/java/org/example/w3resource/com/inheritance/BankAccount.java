package org.example.w3resource.com.inheritance;

public class BankAccount {
    private String accountNumber;
    private double balance;
    private int cache = 1000;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void deposit(double amount) {
        balance += amount;
    }

   void withDraw(double amount){
       if ((balance >= amount)) {
           balance-=amount;
       }else {
           System.out.println("Niewystarczający stan konta");
       }
   }
    public double getBalance(){
        return balance;
    }
}

class SavingsAccount extends BankAccount {


    public SavingsAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    void withDraw(double amount) {
        if (getBalance() - amount<100){
            System.out.println("Wymagany jest minimalny stan konta = 100 zł.");
        }else {
            super.withDraw(amount);
        }
    }
}

class Main5 {
    public static void main(String[] args) {
        System.out.println("Utwórz konto bankowe (A/c No. BA1234) z początkową kwotą 500 zł");
        BankAccount BA1234 = new BankAccount("BA1234",500);
        System.out.println("Włóż depozyt w wysokości 1000 zł.");
        BA1234.deposit(1000);
        System.out.println("Nowy stan konta wynosi " + BA1234.getBalance());
        System.out.println("Wyjmij 600 zł z konta BA1234 ");
        BA1234.withDraw(600);
        System.out.println("Obecny stan konta wynosi: " + BA1234.getBalance());

        System.out.println("Utwórz nowe konto oszczędnościowe: SA1234 ");
        SavingsAccount SA1234 = new SavingsAccount("SA1234", 450);
        SA1234.withDraw(300);
        System.out.println("Stan konta po transakcji wynosi: " + SA1234.getBalance());

        System.out.println("Utwórz konto oszczędnościowe SA1000 z kwotą początkową 300 zł.");
        SavingsAccount SA1000 = new SavingsAccount("SA1000", 300);
        System.out.println("Spróbuj wybrać 250 zł. ");
        SA1000.withDraw(250);
        System.out.println("Stan konta po transakcji wynosi: " + SA1000.getBalance());
    }
}