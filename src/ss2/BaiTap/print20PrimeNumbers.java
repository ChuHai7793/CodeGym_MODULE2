package ss2.BaiTap;

import java.util.Scanner;



public class print20PrimeNumbers {
    static Boolean PrimeCheck (int number) {

        if (number < 2) {
            System.out.println(number + "is not a number");
        } else {
            int i = 2;
            boolean check = true;

            while (i < number) {
                if (number % i == 0) {
                    check = false;
                    break;
                }
                i++;
            }
            if (check) {
                System.out.println(number + " is a prime number");
                return true;
            } else {
//                System.out.println("not a prime number");
            }
            return check;
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
            };
            N++;
            }
        }
    }
