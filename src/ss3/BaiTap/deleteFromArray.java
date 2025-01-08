package ss3.BaiTap;


import java.util.Scanner;

public class deleteFromArray {

    static public int[] deleteFromArray(int[] arr) {
        int[] newArr = new int[arr.length - 1];

        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap phan tu muon xoa");
        int delElement = scanner.nextInt();
        boolean delIndex = false;
        for (int i = 0; i < arr.length - 1; i++) {
            if (!delIndex) {
                if(i==arr.length-2){
                    System.out.println("NOT FOUND");
                    return null;
                }
                if (arr[i] == delElement) {
                    delIndex = true;
                    newArr[i] = arr[i + 1];
                    continue;
                }
                newArr[i] = arr[i];
            } else {
                newArr[i] = arr[i + 1];

            }
        }

        for (int j = 0; j < newArr.length; j++) {
            System.out.println(newArr[j]);
        }
        return newArr;
    }

    public static void main(String[] args) {


        int[] arr = {1, 2, 3, 4, 5};
        int[] newArr = deleteFromArray(arr);

    }
}
