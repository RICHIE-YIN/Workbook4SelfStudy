package com.pluralsight.BeforeEach;

public class Dice {

    public static void main(String[] args) {




    }

    private int lastRoll = 0;

    public int roll() {
        lastRoll = (int) (Math.random() * 6) + 1;
        return lastRoll;
    }

    public int getLastRoll() {
        return lastRoll;
    }
}
