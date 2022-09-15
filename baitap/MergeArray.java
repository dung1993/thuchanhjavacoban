package baitap;

import java.util.Arrays;
import java.util.Scanner;

public class MergeArray {
    public static void main(String[] args) {
        int[] array1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input size of listnumber 1 :");
        int size1 = scanner.nextInt();
        array1 = new int[size1];
        for (int i = 0; i < array1.length; i++) {
            System.out.println("Input number " + i + " :");
            array1[i] = scanner.nextInt();
        }
        int[] array2;
        System.out.println("Input size of listnumber 2 :");
        int size2 = scanner.nextInt();
        array2 = new int[size2];
        for (int i = 0; i < array2.length; i++) {
            System.out.println("Input number " + i + " :");
            array2[i] = scanner.nextInt();
        }

        int[] array3 = new int[size1 + size2];
        for (int i = 0; i < array1.length; i++) {
            array3[i] = array1[i];
        }
        for (int i = 0; i < array2.length; i++) {
            array3[i + size1] = array2[i];
        }
        System.out.println("Result: ");
        System.out.println(Arrays.toString(array3));

    }
}
