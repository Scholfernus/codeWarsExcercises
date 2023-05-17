package org.example;

public class metodaequals {
    public static void main(String[] args) {


        String a = "abc";
        String b = "abc";
        String c = new String("abc");

        System.out.println(a == b); // true - obie zmienne wskazują na ten sam obiekt w pamięci operacyjnej
        System.out.println(a == c); // false - obie zmienne wskazują na różne obiekty w pamięci operacyjnej
        System.out.println(a.equals(b)); // true - metoda equals() porównuje zawartość obiektów, a w tym przypadku jest to identyczne
        System.out.println(a.equals(c)); // true - metoda equals() porównuje zawartość obiektów, a w tym przypadku jest to identyczne
    }
}
