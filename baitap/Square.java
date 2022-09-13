package baitap;


import java.util.Scanner;

public class Square {
    public static void main(String[] args) {
        int choice = -1;
        Scanner scanner = new Scanner(System.in);
        while (choice != 0){
            System.out.println("Menu");
            System.out.println("1. Draw the square");
            System.out.println("2. Draw the triangleUp");
            System.out.println("3. Draw the triangleDown");
            System.out.println("4. Exit");
            System.out.println("Enter your choice:");
            choice = scanner.nextInt();
        }
        switch (choice){
            case 1:
                System.out.println("Draw the square");
                square();
                break;
            case 2:
                System.out.println("Draw the triangleUp");
                triangleUp();
                break;
            case 3:
                System.out.println("triangleDown");
                triangleDown();
                break;
            case 0:
                System.exit(0);
            default:
                System.out.println("No choice");
        }
    }

    public static void square() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }

    public static void triangleUp() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }

    public static void triangleDown() {
        for (int i = 0; i < 5; i++) {
            for (int j = 5; j > i; j--) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }
}
