package anhcubatlam;

import java.util.Scanner;

public class Fibonaci {
    public static void main(String[] args) {
        int n , number1 = 0 , number2 = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập n là số nguyên dương:");
        n = scanner.nextInt();
        System.out.print("Dãy Fibonaci với" + n + "số là:");
        while ( n < 0){
            System.out.println("Nhập lại số nguyên dương bất kỳ");
            n = scanner.nextInt();
        }
        for (int i = 1; i <= n; i++){
            System.out.print(number1 + "");
            int sum = number1 + number2;
            number1 = number2;
            number2 = sum;
        }

    }
}
