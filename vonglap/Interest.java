package vonglap;

import java.util.Scanner;

public class Interest {
    public static void main(String[] args) {
        double money = 1.0;
        int month = 1;
        double interestRate = 1.0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter investment amount!");
        money = scanner.nextDouble();
        System.out.println("Enter month!");
        month = scanner.nextInt();
        System.out.println("Enter interest Rate!");
        interestRate = scanner.nextDouble();
        double totalinterest = 0.0;
        for (int i = 0; i < month; i++) {
            totalinterest += money * (interestRate / 100) / 12 * month;
        }
        System.out.println("total of interest = " + totalinterest);
    }
}
