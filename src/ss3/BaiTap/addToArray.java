package ss3.BaiTap;

import java.util.Scanner;

public class addToArray {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};
        int[] newArr= new int[arr.length + 1];

        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap vi tri muon them");
        int addPosition = scanner.nextInt();
        System.out.println("Nhap phan tu muon them");
        int addElement = scanner.nextInt();

        for (int i = 0; i< newArr.length;i++) {
            if (i < addPosition) {
                newArr[i] = arr[i];
            } else if (i == addPosition) {
                newArr[i] = addElement;
            } else {
                newArr[i] = arr[i - 1];
            }
        }

        for (int j = 0; j<newArr.length;j++){
            System.out.println(newArr[j]);
        }

    }
}
