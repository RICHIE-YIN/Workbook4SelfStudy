package com.pluralsight.PhaseTwo_ClassRelationships.CardDeck;
import java.util.ArrayList;

public class Deck {
    private ArrayList<Card> cards = new ArrayList<>();

    public Deck() {
        String[] suits = {"Hearts", "Clubs", "Spades", "Diamonds"};
        String[] values = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        for(String suit : suits) {
            for(String value : values) {
                cards.add(new Card(suit, value));
            }
        }
    }

    public Card deal() {
        if (cards.size() == 0) {
            return null;
        }
        return cards.remove(0);
    }

    public int getSize() {
        return cards.size();
    }
}
