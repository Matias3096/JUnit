package org.example.example;

public class ConversorTemperatura {
    public double celsiusAFahrenheit(double celsius){
        return (celsius * 9/5); //Error intencional, omitimos el 32
    }

    public double fahrenheitACelcius(double fahrenheit){
        return (fahrenheit - 32) * 5/9;
    }
}
