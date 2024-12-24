package ss2.ThucHanh;

import java.util.Scanner;

public class interestCalculator {
    public static void main(String[] args) {

        double money = 10;
        int month = 2;
        double interestRate = 2.5 ;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap vao so tien");
        money = scanner.nextDouble();
        System.out.println("Nhap vao so thang");
        month = scanner.nextInt();
        System.out.println("Nhap vao lai suat");
        interestRate = scanner.nextDouble();

        double totalInterest = 0;
        for (int i = 0; i<month;i++){

            totalInterest+= money * (interestRate/100)/12 * month;
        }
        System.out.println("Total of interest: " + totalInterest);

    }
}