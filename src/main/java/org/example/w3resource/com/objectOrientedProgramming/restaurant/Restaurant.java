package org.example.w3resource.com.objectOrientedProgramming.restaurant;

import java.util.ArrayList;

public class Restaurant {
    private ArrayList<String> menuItems;
    private ArrayList<Double> prices;
    private ArrayList<Integer> ratings;
    private ArrayList<Integer> itemCounts;

    public Restaurant() {
        this.menuItems = new ArrayList<String>();
        this.prices = new ArrayList<Double>();
        this.ratings = new ArrayList<Integer>();
        this.itemCounts = new ArrayList<Integer>();
    }

}
