package ss2.ThucHanh;


import java.util.Scanner;

public class PrimeCheck {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number");
        int number = scanner.nextInt();

        if (number < 2) {
            System.out.println(number + "is not a number");
        } else {
            int i = 2;
            boolean check = true;

            while (i < number){
                if (number % i == 0){
                    check = false;
                    break;
                }
                i++;
            }
            if (check) {
                System.out.println("is a prime number");
            } else {
                System.out.println("not a prime number");
            }
        }



    }
}