package org.example.genericClass;

public class GenericExc1_Pair<T,I> {
    private T firstValue;
    private I secondValue;
    public GenericExc1_Pair() {
    }

    public GenericExc1_Pair(T firstValue, I secondValue) {
        this.firstValue = firstValue;
        this.secondValue = secondValue;
    }

    public T getFirstValue() {
        return firstValue;
    }

    public void setFirstValue(T firstValue) {
        this.firstValue = firstValue;
    }

    public I getSecondValue() {
        return secondValue;
    }

    public void setSecondValue(I secondValue) {
        this.secondValue = secondValue;
    }

    public static void main(String[] args) {
        // Napisz klasę generyczną Pair, która przechowuje dwie wartości różnych typów i udostępnia metody dostępowe
        // getFirst() i getSecond(). Klasa powinna mieć konstruktor, który przyjmuje obie wartości i zapisuje je w polach klasy.
        GenericExc1_Pair<String,Integer> pair = new GenericExc1_Pair<>("Dobry", 125);
        String firstString = pair.getFirstValue();
        Integer value = pair.getSecondValue();
        System.out.println(firstString + " " + value);

    }
}
