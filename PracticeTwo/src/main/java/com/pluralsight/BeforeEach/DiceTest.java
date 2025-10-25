package com.pluralsight.BeforeEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class DiceTest {
    private Dice dice;

    //runs before every new test
    @BeforeEach
    void initiation() {
        dice = new Dice();
    }

    @Test
    void newDice_startsAtZero() {
        assertEquals(0, dice.getLastRoll());
    }

    @Test
    void roll_returnValueBetween1and6() {
        int rollDice = dice.roll();
        assertTrue(rollDice >= 1 && rollDice <=6);
    }

}
