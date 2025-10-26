package com.pluralsight.PhaseTwo_ClassRelationships.CoffeeShopDrinkCustomer;

import java.util.ArrayList;

public class CoffeeShop {
    private String name;
    private ArrayList<Customer> customer = new ArrayList<>();

    public void calculateTotalSales() {
        double totalSales = 0;
        for (Customer cus : customer) {
            for (Drink drinks : cus.getOrder()) {
                totalSales += drinks.getPrice();
            }
        }
        System.out.println("Total sales: " + totalSales);
    }

    public void findMostExpensiveDrink() {
        double highest = 0;
        for (Customer cus : customer) {
            for (Drink drinks : cus.getOrder()) {
                if (drinks.getPrice() > highest) {
                    highest = drinks.getPrice();
                }
            }
        }
        System.out.println("Most expensive drink: " + highest);
    }

    public void addCustomer(Customer newCustomer) {
        customer.add(newCustomer);
    }

    public CoffeeShop(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Customer> getCustomer() {
        return customer;
    }

    public void setCustomer(ArrayList<Customer> customer) {
        this.customer = customer;
    }
}
