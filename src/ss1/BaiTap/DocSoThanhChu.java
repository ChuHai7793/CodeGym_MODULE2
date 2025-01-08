package ss1.BaiTap;

import java.util.Scanner;

public class DocSoThanhChu {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Nhap so can dien: ");
        int num = input.nextInt();

        int hundreds = num / 100;
        int twoDigitsNum = num % 100;
        String hundredsString = "";
        hundredsString = switch (hundreds) {
            case 1 -> "one hundred";
            case 2 -> "two hundred";
            case 3 -> "three hundred";
            case 4 -> "four hundred";
            case 5 -> "five hundred";
            case 6 -> "six hundred";
            case 7 -> "seven hundred";
            case 8 -> "eight hundred";
            case 9 -> "nine hundred";
            default -> hundredsString;
        };


        int tens = twoDigitsNum / 10;
        int ones = twoDigitsNum % 10;
        String tensString = "";
        String onesString = "";
        tensString = switch (tens) {
            case 1 -> "special";
            case 2 -> "twenty";
            case 3 -> "thirty";
            case 4 -> "forty";
            case 5 -> "fifty";
            case 6 -> "sixty";
            case 7 -> "seventy";
            case 8 -> "eighty";
            case 9 -> "ninety";
            default -> tensString;
        };

        if (tensString.equals("special")) {
            tensString = "";
            onesString = switch (twoDigitsNum) {
                case 11 -> "eleven";
                case 12 -> "twelve";
                case 13 -> "thirty";
                case 14 -> "fourteen";
                case 15 -> "fifteen";
                case 16 -> "sixteen";
                case 17 -> "seventeen";
                case 18 -> "eighteen";
                case 19 -> "nineteen";
                default -> onesString;
            };
        } else {
            onesString = switch (ones) {
                case 1 -> "one";
                case 2 -> "two";
                case 3 -> "three";
                case 4 -> "four";
                case 5 -> "five";
                case 6 -> "six";
                case 7 -> "seven";
                case 8 -> "eight";
                case 9 -> "nine";
                default -> onesString;
            };
        }
        if (!tensString.isEmpty()) {
            System.out.println(hundredsString + " " + tensString + " " + onesString);
        } else {
            System.out.println(hundredsString + " and " + onesString);
        }
    }
}
