package baitap;

import java.util.Scanner;

public class Integer20 {
    public static void main(String[] args) {

        int numbers;
        int count = 0;
        int check = 0;
        for (numbers = 2; count <= 20; numbers++) {
            for (int i = 2; i <= Math.sqrt(numbers); i++) {
                if (numbers % i == 0) {
                    check++;
                }
            }
            if (check == 0) {
                System.out.println(numbers);
                count++;
            }
            check = 0;
        }
    }

}
