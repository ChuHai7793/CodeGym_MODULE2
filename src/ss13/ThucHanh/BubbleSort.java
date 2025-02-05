package ss13.ThucHanh;

public class BubbleSort {

    public static void bubbleSort(int[] arr) {

        for (int i = 0; i < arr.length; i++) {

            for (int j = arr.length - 1; j > i; j--) {
                if (arr[j] < arr[j - 1]) {
                    int tmp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
    }

//    public static void bubbleSort(int[] list) {
//        boolean needNextPass = true;
//        for (int k = 1; k < list.length && needNextPass; k++) {
//            /* Array may be sorted and next pass not needed */
//            needNextPass = false;
//            for (int i = 0; i < list.length - k; i++) {
//                if (list[i] > list[i + 1]) {
//                    /* Swap list[i] with list[i + 1] */
//                    int temp = list[i];
//                    list[i] = list[i + 1];
//                    list[i + 1] = temp;
//
//                    needNextPass = true; /* Next pass still needed */
//                }
//            }
//        }
//    }

    public static void main(String[] args) {

        int[] arr = {1, 5, 3, 4,8,9,-4};
        bubbleSort(arr);
        for (int i : arr) {
            System.out.println(i);
        }


    }
}
