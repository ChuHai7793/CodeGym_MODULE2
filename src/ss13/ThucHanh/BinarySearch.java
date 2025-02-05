package ss13.ThucHanh;


public class BinarySearch {
    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2; // De phong truong hop overflow

            if (arr[mid] == target) {
                return mid; // Found target
            } else if (arr[mid] < target) {
                left = mid + 1; // Tim ben trai
            } else {
                right = mid - 1; // Tim ben phai
            }
        }

        return -1; // Target not found
    }
    public static void main(String[] args) {
        int[] sortedArray = {1, 2,3,4 ,5,6,7,8,9};
        int target = 7;

        int result = binarySearch(sortedArray, target);
        if (result != -1) {
            System.out.println("INDEX OF "+target+" is "+result);
        } else {
            System.out.println("NOT FOUND");
        }
    }
}