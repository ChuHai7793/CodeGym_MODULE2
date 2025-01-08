package ss2.BaiTap;


import java.util.Scanner;

public class DisplayGeometry {
    public static void main(String[] args) {

        // BAI 1
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Nhap chieu dai: ");
//        int width = scanner.nextInt();
//        System.out.println("Nhap chieu rong: ");
//        int height = scanner.nextInt();
//
//        String str = "";
//        for (int j =0; j< width; j++){
//            str = str.concat( "*");
//        }
//
//        for (int i = 0; i < height; i++) {
//            System.out.println(str);
//        }

        // BAI 2
//        String str;
//        for (int i=1; i<=5; i++) {
//            str = "";
//            for (int j=0; j<i; j++) {
//                str = str.concat("*");
//            }
//            System.out.println(str);
//        }

        // BAI 3
//        String str;
//        for(int i=6;i>=1;i--){
//            str = "";
//            for (int j=1; j<i; j++) {
//                str = str.concat("*");
//            }
//            System.out.println(str);
//        }

        // BAI 4

        for (int i = 0; i < 5; i++) {
            String str1 = "";
            String str2 = "";
            for (int j = 4-i; j > 0; j--) {
                str1 = str1.concat(" ");
            }
            for (int k = 0; k <2*i+1; k ++) {
                str2 = str2.concat("*");
            }
            System.out.println(str1 + str2);
        }
    }
}