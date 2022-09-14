package com.codegym;

import java.util.Scanner;

public class ValueInArray {
    public static void main(String[] args) {
        String[] students = {"Duy","Loi","Cuong","Luyn","Hoan"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input Name!");
        String name = scanner.nextLine();
        boolean isExist = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(name)) {
                System.out.println("Position of the students in the list " + name + " is: " + i);
                isExist = true;
                break;
            }
        }
        if (!isExist) {
            System.out.println("Not found" + name + " in the list.");
        }
    }
}
