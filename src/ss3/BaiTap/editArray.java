package ss3.BaiTap;

import java.util.Scanner;

public class editArray {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};

        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap vi tri muon sua");
        int editPosition = scanner.nextInt();
        System.out.println("Nhap phan tu muon thay the");
        int replaceElement = scanner.nextInt();

        for (int i = 0; i < arr.length; i++) {
            if (i == editPosition) {
                arr[i] = replaceElement;
                }
            }
        for (int j = 0; j < arr.length; j++) {
            System.out.println(arr[j]);
        }
    }
}