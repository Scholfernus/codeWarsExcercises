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
        Bankomat bankomat = new Bankomat();
        bankomat.changePin(1234, 5678);

    }
}

