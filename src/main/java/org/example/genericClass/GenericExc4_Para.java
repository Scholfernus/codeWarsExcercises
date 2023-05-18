package org.example.genericClass;

public class GenericExc4_Para<K, V> {
    private K key;
    private V value;

    public GenericExc4_Para(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public static <K, V> void printPair(GenericExc4_Para<K, V> pair) {
        System.out.println("Klucz " + pair.getKey() + " Wartość " + pair.getValue());
    }

    public static void main(String[] args) {
        GenericExc4_Para<String, Integer> mix = new GenericExc4_Para<>("Liczba", 10);
        GenericExc4_Para<String, String> theSame = new GenericExc4_Para<>("Imię", "Józef");
        GenericExc4_Para<Integer, Integer> liczby = new GenericExc4_Para<>(5, 33);
        printPair(mix);
        printPair(theSame);
        printPair(liczby);
    }
}
