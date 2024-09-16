package project1;

import java.util.Scanner;

public class Temp_conv {

    // Method to convert Celsius to Fahrenheit
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }

    // Method to convert Celsius to Kelvin
    public static double celsiusToKelvin(double celsius) {
        return celsius + 273.15;
    }

    // Method to convert Fahrenheit to Celsius
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }

    // Method to convert Fahrenheit to Kelvin
    public static double fahrenheitToKelvin(double fahrenheit) {
        return fahrenheitToCelsius(fahrenheit) + 273.15;
    }

    // Method to convert Kelvin to Celsius
    public static double kelvinToCelsius(double kelvin) {
        return kelvin - 273.15;
    }

    // Method to convert Kelvin to Fahrenheit
    public static double kelvinToFahrenheit(double kelvin) {
        return (kelvinToCelsius(kelvin) * 9/5) + 32;
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for temperature value
        System.out.print("Enter the temperature: ");
        double temperature = scanner.nextDouble();

        // Prompt user for the unit of the temperature
        System.out.print("Enter the unit (Celsius, Fahrenheit, Kelvin): ");
        String unit = scanner.next().toLowerCase();

        // Conversion logic based on the input unit
        switch (unit) {
            case "celsius":
                System.out.println("Temperature in Fahrenheit: " + celsiusToFahrenheit(temperature) + "°F");
                System.out.println("Temperature in Kelvin: " + celsiusToKelvin(temperature) + "K");
                break;

            case "fahrenheit":
                System.out.println("Temperature in Celsius: " + fahrenheitToCelsius(temperature) + "°C");
                System.out.println("Temperature in Kelvin: " + fahrenheitToKelvin(temperature) + "K");
                break;

            case "kelvin":
                System.out.println("Temperature in Celsius: " + kelvinToCelsius(temperature) + "°C");
                System.out.println("Temperature in Fahrenheit: " + kelvinToFahrenheit(temperature) + "°F");
                break;

            default:
                System.out.println("Invalid unit entered.");
                break;
        }

        // Close the scanner
        scanner.close();
    }
}
