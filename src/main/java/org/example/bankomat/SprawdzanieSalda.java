package org.example.bankomat;

public class SprawdzanieSalda extends Bankomat {
    private int accountState;

    public SprawdzanieSalda() {

        this.accountState = 0;
    }

    public int cashCheck() {

        return this.accountState;
    }

    public SprawdzanieSalda(int accountState){
        this.accountState = accountState;
    }
    public void addFunds(int amount) {
        this.accountState += amount;
    }
}

