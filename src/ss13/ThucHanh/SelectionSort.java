package ss13.ThucHanh;

public class SelectionSort {

    public static void selectionSort(int[] arr){

        int min;
        for (int i = 0; i<arr.length-1;i++){
            min = i;
            for (int j = i+1;j<arr.length;j++){
                if (arr[min]>arr[j]){
                    min = j;
                }
            }
            int tmp = arr[i];
            arr[i]=arr[min];
            arr[min] = tmp;
        }

    }

    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 4,8,15,2,61};
        selectionSort(arr);
        for (int i : arr) {
            System.out.println(i);
        }

    }
}
