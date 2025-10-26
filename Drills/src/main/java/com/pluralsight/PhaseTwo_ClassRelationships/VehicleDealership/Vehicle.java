package com.pluralsight.PhaseTwo_ClassRelationships.VehicleDealership;

public class Vehicle {
    private int vin;
    private String make;
    private String model;
    private double price;

    public Vehicle(int vin, String make, String model, double price) {
        this.vin = vin;
        this.make = make;
        this.model = model;
        this.price = price;
    }



    public int getVin() {
        return vin;
    }

    public void setVin(int vin) {
        this.vin = vin;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
