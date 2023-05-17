package org.example.bankomat;
public class PinChange extends Bankomat {
    private int PIN;

    public PinChange(int PIN) {
        this.PIN = PIN;
    }
    public int getPIN() {
        return this.PIN;
    }
    public void changePin(int oldPin, int newPin){
        if (oldPin == this.PIN){
           this.PIN = newPin;
            System.out.println("PIN został zmieniony.");
        }else {
            System.out.println("Błędny PIN");
        }
    }
}
