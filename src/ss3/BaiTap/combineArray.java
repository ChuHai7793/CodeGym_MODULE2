package ss3.BaiTap;


public class combineArray {
    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {7, 7, 8, 9};
        int[] newArr = new int[arr1.length + arr2.length];

        for (int i= 0; i<arr1.length + arr2.length;i++){
            if (i<arr1.length){
                newArr[i] = arr1[i];
            } else {
                newArr[i] = arr2[i-arr1.length];
            }
        }

        for (int j = 0; j < newArr.length; j++) {
            System.out.println(newArr[j]);
        }
    }
}