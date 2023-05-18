package org.example.genericClass;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class GenericExc3_Object<T> {

    private List<T> stack = new ArrayList<>();
    private List<T> numbers = new ArrayList<>();
    private boolean isEmpty = true;

    public static void main(String[] args) {
        GenericExc3_Object<String> object = new GenericExc3_Object(" ");
        GenericExc3_Object<Integer>numbers = new GenericExc3_Object<>(1);
        numbers.put(3);
        object.put("World");
        Integer which =numbers.get();
        String item = object.get();
        System.out.println(item);
        System.out.println(which);
    }

    public GenericExc3_Object(boolean isEmpty) {
        this.isEmpty = isEmpty;
    }

    public GenericExc3_Object(List<T> stack) {
        this.stack = stack;
    }
    public GenericExc3_Object(T element){
        put(element);
    }


    void put(T item) {
        stack.add(item);
        isEmpty = false;
        }

    T get() {
    if (!isEmpty){
       return stack.remove(stack.size()-1);
    }else {
     throw new NoSuchElementException ("No such element");
    }
    }

}
