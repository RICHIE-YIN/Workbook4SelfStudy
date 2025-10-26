package com.pluralsight.PhaseTwo_ClassRelationships.PlayerInventoryItem;

import java.util.ArrayList;

public class Inventory {
    private ArrayList<Item> items = new ArrayList<>();

    public ArrayList<Item> getItems() {
        return items;
    }

    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }

    public void addItem(String name, int value) {
        items.add(new Item(name, value));
    }

    public void getTotalValue() {
        int total = 0;
        for(Item item : items) {
            total += item.getValue();
        }
        System.out.println(total);
//        return total;
    }
}
