package org.example.Bankomat;

public  class Bankomat {
    private long nrAccount;
    private int stateAccount;
    private int PIN;

    protected Bankomat() {
    }

    public static void main(String[] args) {
        SprawdzanieSalda saldo = new SprawdzanieSalda(1000);
        int stanKonta = saldo.cashCheck();
        System.out.println("Stan konta: " + stanKonta);
        PinChange change = new PinChange(1234);
        change.changePin(1234,3698);
        System.out.println("Nowy PIN " + change.getPIN());
        Bankomat bankomat = new Bankomat();
        bankomat.dodajSrodki(2500);
        saldo.addFunds(2500);


    }
    public void dodajSrodki(int kwota){
        this.stateAccount += kwota;
        System.out.println("Dokonano wpłaty, aktualny stan konta = " + this.stateAccount);
    }
}

