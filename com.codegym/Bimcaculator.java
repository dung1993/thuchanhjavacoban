package com.codegym;

import java.util.Scanner;

public class Bimcaculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double weight, height, bmi;
        System.out.print("Your weight (in kilogram):");
        weight = scanner.nextDouble();

        System.out.print("Your height (in centimeter):");
        height = scanner.nextDouble();
        bmi = weight / (height*height);
        System.out.println("Interpretation:");

        if (bmi < 18)
            System.out.println("Underweight");
        else if (bmi < 25.0)
            System.out.println("Normal");
        else if (bmi < 30.0)
            System.out.println("Overweight");
        else
            System.out.println("Obese");
    }
}

