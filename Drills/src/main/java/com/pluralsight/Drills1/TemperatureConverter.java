package com.pluralsight.Drills1;

public class TemperatureConverter {

    public double toCelcius(double fahrenheit) {
        return (fahrenheit - 32) * 5.0 / 9.0;
    }

    public double toFahrenheit(double celsius) {
        return (celsius * 9.0 / 5.0) + 32;
    }

}
