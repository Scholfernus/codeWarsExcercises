package org.example.w3resource.com.objectOrientedProgramming;

import java.util.ArrayList;

public class Product {
    private String name;
    private int quantity;

    public Product(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}

class Inventory {
    private ArrayList<Product> products = new ArrayList<>();

    public Inventory() {
    }

    public Inventory(ArrayList<Product> products) {
        this.products = products;
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void removeProduct(Product product) {
        products.remove(product);
    }

    public void checkLowInventory() {
        for (Product pro : products) {
            if (pro.getQuantity() <= 100) {
                System.out.println(pro.getName() + " is running low on inventory. Current quantity: " +
                        pro.getQuantity());
            }
        }
    }
}

class Main12 {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        Product product1 = new Product("Led TV", 200);
        Product product2 = new Product("Mobile", 80);
        Product product3 = new Product("Tablet", 50);
        System.out.println("Add three products in inventory:");
        inventory.addProduct(product1);
        inventory.addProduct(product2);
        inventory.addProduct(product3);
        System.out.println("\nCheck low inventory:");
        inventory.checkLowInventory();
        System.out.println("\nRemove Tablet from the inventory!");
        inventory.removeProduct(product3);
        System.out.println("\nAgain check low inventory:");
        inventory.checkLowInventory();
    }
}