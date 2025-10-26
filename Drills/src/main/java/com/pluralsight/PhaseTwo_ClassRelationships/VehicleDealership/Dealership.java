package com.pluralsight.PhaseTwo_ClassRelationships.VehicleDealership;

import java.util.ArrayList;

public class Dealership {
    private String name;
    private ArrayList<Vehicle> inventory = new ArrayList<>();

    public Dealership(String name) {
        this.name = name;
    }

    public void addVehicle(Vehicle vehicle) {
        inventory.add(vehicle);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Vehicle> getInventory() {
        return inventory;
    }

    public void setInventory(ArrayList<Vehicle> inventory) {
        this.inventory = inventory;
    }

    public void displayAllVehicles() {
        for(Vehicle vehicle : inventory) {
            System.out.printf("%d, %s, %s, %.2f\n", vehicle.getVin(), vehicle.getMake(), vehicle.getModel(), vehicle.getPrice());
        }
    }
}
