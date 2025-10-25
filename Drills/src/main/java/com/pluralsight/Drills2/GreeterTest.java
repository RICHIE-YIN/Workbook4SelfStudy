package com.pluralsight.Drills2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GreeterTest {
    private Greeter greeter;

    @BeforeEach
    void initiate() {
        greeter = new Greeter();
    }

    @Test
    void testGreeterOutput() {
        greeter.greet("Richie");
    }
}
