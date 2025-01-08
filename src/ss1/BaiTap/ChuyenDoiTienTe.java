package ss1.BaiTap;

import java.util.Scanner;

public class ChuyenDoiTienTe {
    public static void main(String[] args){
        double rate = 23000;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so tien USD: ");
        double money =  rate*scanner.nextDouble();
        System.out.println("So tien VND: "+ money);
    }
}
