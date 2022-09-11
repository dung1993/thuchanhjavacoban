package anhcubatlam;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int height;
        System.out.printf("Nhập chiều cao tam giác:");
        height = sc.nextInt();
        while (height <= 0) {
            System.out.printf("Nhập lại chiều cao tam giác:");
            height = sc.nextInt();
        }
        for (int i = height; i >=1; --i) {
            for (int j = 1; j <= i; j++) {
                 System.out.print("* ");
            }
            System.out.println();
        }
    }
}
