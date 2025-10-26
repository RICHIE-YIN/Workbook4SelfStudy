package com.pluralsight.PhaseOne_StaticVariablesAndMethods.CatCounterDrill;

public class CatProgram {
    public static void main(String[] args) {
        new Cat("Leo");
        new Cat("James");
        new Cat("Lenon");
        System.out.println("Total cat count: " + Cat.catCount);
    }
}
