package com.codegym;

import java.util.Scanner;

public class Celsius {
    public static void main(String[] args) {
        double fahrenheit, celsius;
        int choice = -1;
        Scanner scanner = new Scanner(System.in);
        while (choice != 0) {
            System.out.println("Menu");
            System.out.println("1. Celsius to Fahrenheit");
            System.out.println("2. Fahrenheit to Celsius");
            System.out.println("0. Exit");
            System.out.println("Enter your choice:");
            choice = scanner.nextInt();
            switch (choice) {
                case 0:
                    System.exit(0);
                case 1:
                    System.out.println("Celsius to Fahrenheit");
                    System.out.println("Input Celsius ");
                    celsius = scanner.nextDouble();
                    System.out.println("Celsius to Fahrenheit:" + celsiusToFahrenheit(celsius));
                    break;
                case 2:
                    System.out.println("Fahrenheit to Celsius");
                    System.out.println("Input Fahrenheit ");
                    fahrenheit = scanner.nextDouble();
                    System.out.println("Fahrenheit to Celsius: " + fahrenheitToCelsius(fahrenheit));
                    break;
                default:
                    System.out.println("No choice");
            }
        }

    }

    public static double fahrenheitToCelsius ( double fahrenheit){
        double celsius = (5.0 / 9) * (fahrenheit - 32);
        return celsius;
    }

    public static double celsiusToFahrenheit ( double celsius){

        double fahrenheit = celsius * 9 / 5.0 + 32;
        return fahrenheit;

    }
}
