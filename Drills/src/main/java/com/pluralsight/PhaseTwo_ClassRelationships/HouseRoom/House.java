package com.pluralsight.PhaseTwo_ClassRelationships.HouseRoom;

import java.util.ArrayList;

public class House {
    private String name;
    private static ArrayList<Room> rooms = new ArrayList<>();

    public House(String name) {
        this.name = name;
    }

    public void addRoom(String name, double sqft) {
        rooms.add(new Room(name, sqft));
    }

    public void displayAllRooms() {
        for(Room room : rooms) {
            System.out.printf("%s, %.2f\n", room.getName(), room.getSqft());
        }
    }

    public double getTotalSqft() {
        double sqftTotal = 0;
        for(Room room : rooms) {
            sqftTotal += room.getSqft();
        }
        return sqftTotal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
