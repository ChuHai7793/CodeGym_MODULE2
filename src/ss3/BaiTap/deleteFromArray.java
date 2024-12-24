package ss3.BaiTap;


import java.util.Scanner;

public class deleteFromArray {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};
        int[] newArr= new int[arr.length -1];

        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap phan tu muon xoa");
        int delElement = scanner.nextInt();

        for (int i = 0; i< arr.length-1;i++){

            if (arr[i] != delElement){
                newArr[i] = arr[i];
            } else {
                newArr[i] = arr[i+1];
            }
        }

        for (int j = 0; j<newArr.length;j++){
            System.out.println(newArr[j]);
        }

    }
}
