package anhcubatlam;

import java.util.Scanner;

public class Integer {
    public static void main(String[] args) {
        int number = 1 ,n ,count , i;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập n là số nguyên dương:");
        n = scanner.nextInt();
        while ( n <= 0){
            System.out.println("Nhập lại số nguyên dương bất kỳ");
            n = scanner.nextInt();
        }
        while (number <= n){
            count = 0;
            i = 2;
            while (i <= number/2){
                if (number % i == 0){
                    count++;
                    break;
                }
                i++;
            }
            if (count == 0 && number != 1){
                System.out.print(number + " ");
            }
            number++ ;
        }
    }
}
