package org.example.genericClass;

import java.util.ArrayList;
import java.util.List;

public class Pair<K, V> {
    private K first;
    private V second;

    public Pair(K first, V second) {
        this.first = first;
        this.second = second;
    }
    public K getFirst(){
        return first;
    }
    public V getSecond(){
        return second;
    }
    public static <K, V> void getFirst(List<Pair<K, V>> values) {
        for (Pair<K, V> pair : values){
            K firstValue = pair.getFirst();
            System.out.println(firstValue);
        }
    }
    public static <K,V> void getSecondValue(List<Pair<K, V>> values2){
        for (Pair<K,V> pair2 : values2){
            V second2 = pair2.getSecond();
            System.out.println(second2);
        }
    }

    public static void main(String[] args) {

        List<Pair<String,Integer>>mix = new ArrayList<>();
        mix.add(new Pair<>("A", 1));
        mix.add(new Pair<>("B", 2));
        mix.add(new Pair<>("C", 3));

        for (Pair<String,Integer> pair :mix) {
            String first1 = pair.getFirst();
            Integer second1 = pair.getSecond();
            System.out.println(first1 + " " + second1);
        }


    }
}

