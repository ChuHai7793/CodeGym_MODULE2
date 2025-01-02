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

    public static void main(String[] args) {

        int[] arr = {1, 5, 3, 4};
        bubbleSort(arr);
        for (int i : arr) {
            System.out.println(i);
        }


    }
}
