package anhcubatlam;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        int x;
        long f = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập x là số nguyên dương:");
        x = scanner.nextInt();
        while (x <= 0) {
            System.out.println("Nhập lại số nguyên dương bất kỳ");
            x = scanner.nextInt();
        }
        for (int i = 1; i <= x; i++) {
            f = f*i;
        }
        System.out.println("Giai thừa của " + x + " là: " + f);


    }

}
