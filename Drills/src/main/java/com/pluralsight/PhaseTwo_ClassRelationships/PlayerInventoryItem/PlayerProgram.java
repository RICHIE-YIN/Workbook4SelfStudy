package com.pluralsight.PhaseTwo_ClassRelationships.PlayerInventoryItem;

public class PlayerProgram {
    public static void main(String[] args) {
        Player player1 = new Player("Richie");

        player1.pickupItem("Sour Tangie", 30);
        player1.pickupItem("Super Boof", 22);
        player1.pickupItem("Pineapple Express", 12);

        player1.getInventory().addItem("9 lb. hammer", 25);
        player1.showInventory();
        player1.getInventory().getTotalValue();

    }
}
