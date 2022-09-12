package com.codegym;

import java.util.Scanner;

public class Equationone {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("a: ");
        double a = scanner.nextDouble();
        System.out.println("b: ");
        double b = scanner.nextDouble();
        System.out.println("c: ");
        double c = scanner.nextDouble();
        if (a != 0) {
            double x = (c - b) / a;
            System.out.printf("x= " + x);
        }else{
            if(b == c){
                System.out.printf("The solution is all x");
            }else{
                System.out.printf("No solution!");
            }
        }
    }
}
