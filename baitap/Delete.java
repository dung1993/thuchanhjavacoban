package baitap;

import java.util.Arrays;
import java.util.Scanner;

public class Delete {
    public static void main(String[] args) {
        int[] array;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input listnumber you want check");
        int size = scanner.nextInt();
        array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Number " + i + ":");
            array[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(array));
        System.out.println("Input number you want delete:");
        int x = scanner.nextInt();
        int cnt=0;
        for (int i = 0; i < array.length; i++) {
            if (array[i]!=x){
                array[cnt]=array[i];
                cnt++;
            }
        }
        int[] arr =new int[cnt];
        for (int i = 0; i < arr.length; i++){
            arr[i]=array[i];
        }
        System.out.println(Arrays.toString(arr));
    }
}
