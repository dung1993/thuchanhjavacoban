package baitap;

import java.util.Scanner;

public class Usdtovnd {
    public static void main(String[] args) {
        double vnd = 23000;
        double usd;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số USD cần quy đổi: ");
        usd = scanner.nextDouble();
        double value = usd * vnd;
        System.out.println("Giá trị được quy đỏi ra là: " + value);
    }
}
