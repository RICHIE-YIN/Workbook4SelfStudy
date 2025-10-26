package com.pluralsight.PhaseTwo_ClassRelationships.StoreDepartmentProduct;

import java.util.ArrayList;

public class Department {
    private String name;
    private ArrayList<Product> product = new ArrayList<>();

    public void listAllProducts() {
        System.out.printf(name);
        System.out.printf("\n");
        for(Product p : product) {
            System.out.printf("Name: %s, price: %.2f", p.getName(), p.getPrice());
            System.out.printf("\n");
        }
    }

    public void addProduct (Product p) {
        product.add(p);
    }

    public Department(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Product> getProduct() {
        return product;
    }

    public void setProduct(ArrayList<Product> product) {
        this.product = product;
    }
}
