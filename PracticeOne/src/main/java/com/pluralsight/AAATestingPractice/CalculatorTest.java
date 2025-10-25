package com.pluralsight.AAATestingPractice;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    @Test
    void addTwoNumbers_returnCorrectSum() {

        //arrange/ create class inside test
        Calculator calculator = new Calculator();

        //act/ run command
        int result = calculator.add(9, 10);

        //assert/ test
        assertEquals(19, result);
    }
}
