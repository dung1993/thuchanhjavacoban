package baitap;



import java.util.Arrays;
import java.util.Scanner;

public class Smallest {
    public static void main(String[] args) {
        Integer[] array;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input listnumber you want check");
        int size = scanner.nextInt();
        array = new Integer[size];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Number " + i + ":");
            array[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(array));
        int min = array[0];
        int index = 1;
        for (int j = 0; j < array.length; j++) {
            if (array[j] < min) {
                min = array[j];
                index = j + 1;
            }
        }
        System.out.println("The minimun property value in the list is " + min + " at position " + index);
    }
}
