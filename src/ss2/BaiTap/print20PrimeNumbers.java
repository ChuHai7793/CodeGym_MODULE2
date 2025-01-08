package ss2.BaiTap;

import java.util.Scanner;



public class print20PrimeNumbers {
    static Boolean PrimeCheck (int number) {
        if (number >= 2) {
            int i = 2;
            while (i < number) {
                if (number % i == 0) {
                    return false;
                }
                i++;
            }
            return true;
        }
        return false;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap so luong so nguyen to can in ra");
        int numbers = scanner.nextInt();

        int count = 0;

        int N = 2;

        while (count < numbers) {
            if (PrimeCheck(N)){
                count++;
                System.out.println(N + " is a prime number");
            };
            N++;
            }
        }
    }
