package com.pluralsight.PhaseTwo_ClassRelationships.StoreDepartmentProduct;

import java.util.ArrayList;

public class Store {
    private String name;
    private ArrayList<Department> departments = new ArrayList<>();

    public void findProductByName(String name) {
        for(Department d : departments) {
            for(Product p : d.getProduct()) {
                if(p.getName().equalsIgnoreCase(name)) {
                    System.out.printf("Item found!\nDepartment: %s\nItem's name: %s, price %.2f, id: %d", d.getName(), p.getName(), p.getPrice(), p.getId());
                }
            }
        }
    }

    public void listAllDepartments() {
        for(Department d : departments) {
            System.out.println(d.getName());
        }
    }

    public void listAllProducts() {
        System.out.println(name);
        System.out.println("");
        for(Department d : departments) {
            System.out.println("---");
            System.out.println("Department - " + d.getName());
//            System.out.println("");
            for(Product p : d.getProduct()) {
                System.out.printf("Product name: %s, price: .%2f", p.getName(), p.getPrice());
                System.out.println("");
//                System.out.println("");
            }
        }
        System.out.println("----------------------------------------");
    }

    public void addDepartment (Department d) {
        departments.add(d);
    }

    public Store(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Department> getDepartments() {
        return departments;
    }

    public void setDepartments(ArrayList<Department> departments) {
        this.departments = departments;
    }
}
