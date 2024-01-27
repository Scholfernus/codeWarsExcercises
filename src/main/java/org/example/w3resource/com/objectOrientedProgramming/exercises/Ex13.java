package org.example.w3resource.com.objectOrientedProgramming.exercises;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

public class Ex13 {
    //    Write a Java program to create a class called "Inventory" with a collection of products and methods to add
//    and remove products, and to check for low inventory.

    public static void main(String[] args) {
        Inventory invent1 = new Inventory();
        invent1.addProduct("ball");
        invent1.addProduct("doll");
        invent1.addProduct("flute");
        invent1.addProduct("candy");
        invent1.addProduct("guitar");
        invent1.check();
        invent1.removeProduct("doll");


    }
}

@Getter
@Setter
class Inventory {
    private List<String> products;

    public Inventory() {
        this.products = new ArrayList<>();
    }

    public void addProduct(String product) {
        products.add(product);
        System.out.println(products);
    }

    public void removeProduct(String product) {
        products.remove(product);
        System.out.println(products);

    }

    public boolean check() {
        if (products.size() < 100) {
            System.out.println("Inventory has low status!");
        }
        return false;
    }

    @Override
    public String toString() {
        return "Inventory{" +
                "products=" + products +
                '}';
    }
}