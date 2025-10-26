package com.pluralsight.PhaseTwo_ClassRelationships.CardDeck;

public class DeckProgram {
    public static void main(String[] args) {
        Deck deck = new Deck();

        System.out.println("Deck Size: " + deck.getSize());
        Card first_card = deck.deal();
        System.out.println("First card: " + first_card.getValue() + " of " + first_card.getSuit());
        System.out.println("Deck size: " + deck.getSize());
    }
}
