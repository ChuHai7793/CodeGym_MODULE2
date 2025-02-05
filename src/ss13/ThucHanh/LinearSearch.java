package ss13.ThucHanh;

public class LinearSearch {
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; // Tra ve index neu tim thay
            }
        }
        return -1; // Tra ve -1 neu k tim thay
    }

    public static void main(String[] args) {
        int[] array = {5, 2, 17, 10, 9,8,22 };
        int target = 10;

        int result = linearSearch(array, target);
        if (result != -1) {
            System.out.println("INDEX OF "+target+" is "+result);
        } else {
            System.out.println("NOT FOUND");
        }
    }
}