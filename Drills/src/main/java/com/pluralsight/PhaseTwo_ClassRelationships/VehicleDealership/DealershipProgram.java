package com.pluralsight.PhaseTwo_ClassRelationships.VehicleDealership;

public class DealershipProgram {
    public static void main(String[] args) {
        Dealership dealership = new Dealership("Richie's Auto");
        dealership.addVehicle(new Vehicle(1001, "Toyota", "Camry", 24999));
        dealership.addVehicle(new Vehicle(1002, "Honda", "Civic", 21999));
        dealership.displayAllVehicles();
    }
}
