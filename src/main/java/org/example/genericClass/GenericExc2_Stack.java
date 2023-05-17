package org.example.genericClass;

import java.util.ArrayList;
import java.util.List;

// Napisz klasę generyczną Stack, która będzie implementowała stos. Klasa powinna mieć metody push(), pop(), peek() i isEmpty().
// Stos powinien przechowywać elementy dowolnego typu.
// Metoda push() powinna dodawać nowy element na szczyt stosu.
// Metoda pop() powinna usuwać i zwracać element ze szczytu stosu. Jeśli stos jest pusty, metoda powinna zwrócić wartość null.
// Metoda peek() powinna zwracać element ze szczytu stosu, ale nie powinna go usuwać. Jeśli stos jest pusty, metoda powinna zwrócić wartość null.
// Metoda isEmpty() powinna zwracać wartość true, jeśli stos jest pusty, i wartość false, jeśli na stosie znajdują się jakieś elementy.
 public class GenericExc2_Stack<T> {
    private List<T> stack = new ArrayList<>();
    private boolean isEmpty = true;
    public static void main(String[] args) {
    GenericExc2_Stack<Integer>stack = new GenericExc2_Stack<>();
    stack.push(1);
    stack.push(2);
    stack.push(3);




    }

    void push(T element) {
        stack.add(element);
        isEmpty = false;
    }

    void pop() {
        ;
    }

    void peek() {

    }

    void isEmpty() {
        if (stack.isEmpty()) {
            boolean noArgs = isEmpty;
        } else {
            boolean full;
        }
    }

}
