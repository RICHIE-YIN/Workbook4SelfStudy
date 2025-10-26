package com.pluralsight.PhaseTwo_ClassRelationships.PlayerInventoryItem;

import java.util.ArrayList;

public class Player {
    private String name;
    private Inventory inventory = new Inventory();

    public void pickupItem(String name, int value) {
        inventory.addItem(name, value);
    }

    public void showInventory() {
        for(Item i : inventory.getItems()) {
            System.out.printf("Item name: %s, Item value: %d\n", i.getName(), i.getValue());
        }
    }

    public Player(String name) {
        this.name = name;
    }

    public Player(String name, Inventory inventory) {
        this.name = name;
        this.inventory = inventory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }
}
