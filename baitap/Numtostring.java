package baitap;

import java.util.Scanner;

public class Numtostring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number you want translate:");
        int number = scanner.nextInt();
        while (number > 999 || number < 0) {
            System.out.println("Number invalid, Let input new number:");
            number = scanner.nextInt();
        }
        int n = number;
        String hundreds = "";
        String ten = "";
        String one = "";
        int hundred = n / 100;
        int tens = (n % 100) / 10;
        int ones = (n % 100) % 10;
        switch (hundred) {
            case 0:
                hundreds = "";
                break;
            case 1:
                hundreds = "one hundred";
                break;
            case 2:
                hundreds = "two hundred";
                break;
            case 3:
                hundreds = "there hundred";
                break;
            case 4:
                hundreds = "four hundred";
                break;
            case 5:
                hundreds = "five hundred";
                break;
            case 6:
                hundreds = "six hundred";
                break;
            case 7:
                hundreds = "seven hundred";
                break;
            case 8:
                hundreds = "eight hundred";
                break;
            case 9:
                hundreds = "nine hundred";
                break;
        }
        switch (tens) {
            case 1:
                switch (n % 100){
                    case 11:
                        ten = "eleven";
                        break;
                    case 12:
                        ten = "twelve";
                        break;
                    case 13:
                        ten = "thirteen";
                        break;
                    case 14:
                        ten = "fourteen";
                        break;
                    case 15:
                        ten = "fifteen";
                        break;
                    case 16:
                        ten = "sixteen";
                        break;
                    case 17:
                        ten = "seventeen";
                        break;
                    case 18:
                        ten = "eighteen";
                        break;
                    case 19:
                        ten = "nineteen";
                        break;
                }
                break;
            case 2:
                ten = "twenty";
                break;
            case 3:
                ten = "thirty";
                break;
            case 4:
                ten = "fourty";
                break;
            case 5:
                ten = "fifty";
                break;
            case 6:
                ten = "sixty";
                break;
            case 7:
                ten = "seventy";
                break;
            case 8:
                ten = "eighty";
                break;
            case 9:
                ten = "ninety";
                break;
        }
        switch (ones){
            case 1:
                one = "one";
                break;
            case 2:
                one = "two";
                break;
            case 3:
                one = "three";
                break;
            case 4:
                one = "four";
                break;
            case 5:
                one = "five";
                break;
            case 6:
                one = "six";
                break;
            case 7:
                one = "seven";
                break;
            case 8:
                one = "eight";
                break;
            case 9:
                one = "nine";
                break;
        }
        if ((n%100)/10==1)
            System.out.println(hundreds + " " + ten);
        else
            System.out.println(hundreds + " " + ten + " " + one);
        if (n==10){
            System.out.println("ten");
        }
        if (n==0){
            System.out.println("zero");
        }
    }
}
