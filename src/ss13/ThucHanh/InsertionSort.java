package ss13.ThucHanh;

public class InsertionSort {

    public static void insertionSort(int[] arr) {
        int pos,tmp;
        for (int i = 1; i < arr.length; i++) {
            pos = i;
            tmp = arr[i];
            while (pos>0 && tmp < arr[pos-1]) {
                arr[pos] = arr[pos-1];
                pos--;
            }
            arr[pos] = tmp;

        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 4, 8, 15, 2, 61};
        insertionSort(arr);
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
