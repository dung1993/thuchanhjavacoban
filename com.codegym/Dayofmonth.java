package com.codegym;

import java.util.Scanner;

public class Dayofmonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("which month that you want to count day?");
        int month = scanner.nextInt();
        switch (month){
            case 2:
                System.out.print("The month 2 has 28 or 29 day");
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.print("The month has 31 day");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.print("The month has 30 day");
                break;
            default:
                System.out.print("Invalid input!");
                break;
        }
    }
}
