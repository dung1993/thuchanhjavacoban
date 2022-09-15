package baitap;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        int[][] array;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input row: ");
        int row = scanner.nextInt();
        System.out.println("Input columns: ");
        int col = scanner.nextInt();
        array = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.println("Input number in row " + i + " and col " + j);
                array[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println("");
        }
        int max = array[0][0];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                }
            }
        }
        System.out.println("The value largest in array is: " + max);
    }
}
