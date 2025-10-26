package com.pluralsight.PhaseOne_StaticVariablesAndMethods.SharedSettingsExample;

public class GameProgram {
    public static void main(String[] args) {
        System.out.println("Player 1 volume: " + GameSettings.volume);
        GameSettings.volume = 10;
        System.out.println("Player 2 volume: " + GameSettings.volume);
    }
}
