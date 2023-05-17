package org.example.bankomat;

public class Wplata extends Bankomat {
    private int cashIn;
    public Wplata(int cash) {
        this.cashIn = cash;
    }
    public void wykonaj() {
        dodajSrodki(this.cashIn);
    }
    public void makeDeposit(SprawdzanieSalda saldo) {
        saldo.addFunds(this.cashIn);
        System.out.println("Dokonano wpłaty, aktualny stan konta = " + saldo.cashCheck());
    }
}

