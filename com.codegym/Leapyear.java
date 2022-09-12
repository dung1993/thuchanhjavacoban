package com.codegym;

import java.util.Scanner;

public class Leapyear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year;
        System.out.println("Enter year!");
        year = scanner.nextInt();
        while (year < 0){
            System.out.println("Enter year again!");
            year = scanner.nextInt();
        }
        if(year % 4 == 0){
            if(year % 100 == 0){
                if(year % 400 == 0){
                    System.out.println(year +" is a leap year!");
                }else{
                    System.out.println(year + " is not a leap year!");
                }
            }else {
                System.out.println(year +" is a leap year!");
            }
        }else {
            System.out.println(year + " is not a leap year!");
        }
    }
}
