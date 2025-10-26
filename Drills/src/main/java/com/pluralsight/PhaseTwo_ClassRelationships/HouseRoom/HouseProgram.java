package com.pluralsight.PhaseTwo_ClassRelationships.HouseRoom;

public class HouseProgram {
    public static void main(String[] args) {
    House house = new House("Richie's House");

    house.addRoom("Richie's room", 600);
    house.addRoom("Kayla's room", 650);
    house.addRoom("Rickys's room", 400);
    house.addRoom("Kylie's room", 350);

    house.displayAllRooms();
    System.out.println(house.getTotalSqft());
    }
}
