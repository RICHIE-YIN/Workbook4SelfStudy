package com.pluralsight.PhaseTwo_ClassRelationships.HouseRoom;

public class Room {

    private String name;
    private double sqft;

    public Room(String name, double sqft) {
        this.name = name;
        this.sqft = sqft;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSqft() {
        return sqft;
    }

    public void setSqft(double sqft) {
        this.sqft = sqft;
    }
}
