package com.pluralsight.Drills1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TemperatureConverterTest {
    private  TemperatureConverter temp;

    @BeforeEach
    void initiation () {
        temp = new TemperatureConverter();
    }

    @Test
    void testConvertToFahrenheit() {
        double test = temp.toFahrenheit(100);
        assertEquals(212, test);
    }

    @Test
    void testConvertToCelsius() {
        double test = temp.toCelcius(32);
        assertEquals(0, test);
    }
}
