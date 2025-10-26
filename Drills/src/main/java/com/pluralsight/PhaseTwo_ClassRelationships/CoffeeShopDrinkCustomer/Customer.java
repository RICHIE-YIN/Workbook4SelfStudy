package com.pluralsight.PhaseTwo_ClassRelationships.CoffeeShopDrinkCustomer;

import java.util.ArrayList;

public class Customer {
    private String name;
    private ArrayList<Drink> order = new ArrayList<>();

    public void addDrink(Drink drink) {
        order.add(drink);
    }

    public Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Drink> getOrder() {
        return order;
    }

    public void setOrder(ArrayList<Drink> order) {
        this.order = order;
    }
}
