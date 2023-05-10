package org.example.Bankomat;
public class PinChange extends Bankomat {
    private int number;
    public PinChange(int number) {
        this.number = number;
    }
    public void changePin(int oldPin, int newPin){
        if (oldPin == PIN){
            PIN == newPin;
            System.out.println("PIN został zmieniony.");
        }else {
            System.out.println("Błędny PIN");
        }
    }
}
