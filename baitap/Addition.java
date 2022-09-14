package baitap;

import java.util.Arrays;
import java.util.Scanner;

public class Addition {
    public static void main(String[] args) {
        Integer[] array;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input listnumber you want check");
        int size = scanner.nextInt();
        array = new Integer[size];
        for (int i = 0; i < array.length-1; i++) {
            System.out.println("Number " + i + ":");
            array[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(array));
        System.out.println("Input number you want add:");
        int x = scanner.nextInt();
        System.out.println("Input location you want add:");
        int index = scanner.nextInt();
        while (index < 0 || index > array.length - 1) {
            System.out.println("We can't add in this location!:");
            System.out.println("Again! Input new location you want add:");
            index = scanner.nextInt();
        }

        for (int i = array.length-2; i>=index;i--) {
            array[i+1]=array[i];
        }
        array[index] = x;
        System.out.println(Arrays.toString(array));
    }
}
