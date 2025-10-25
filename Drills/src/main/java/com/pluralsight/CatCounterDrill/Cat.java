package com.pluralsight.CatCounterDrill;

public class Cat {
    public static int catCount = 0;
    private String name;

    public Cat(String name) {
        this.name = name;
        catCount++;
    }

    public String getName() {
        return name;
    }
}
