package ss2.ThucHanh;

import java.util.Scanner;

public class greatest_common_factor {
    public static void main(String[] args) {



        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap a");
        int a = scanner.nextInt();
        System.out.println("Nhap b");
        int b = scanner.nextInt();


        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        System.out.println("USCLN la " + a);

    }
}