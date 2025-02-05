package ss11.BaiTap;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class ReverseStack {


    public static void main(String[] args) {

        int[] intArray = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        ArrayList<Integer> intArrList = new ArrayList<Integer>();
        for (int j : intArray) {
            intArrList.add(j);
        }

        reverseArr(intArrList);
        System.out.println(intArrList);


        String str = "you are a good dog";
        String[] strArray = str.split(" ");
        ArrayList<String> strArrList = new ArrayList<>();
        Collections.addAll(strArrList, strArray);

        reverseArr(strArrList);
        System.out.printf(String.valueOf(strArrList));

    }

    private static <T> void reverseArr(ArrayList<T> arr) {
        Stack<T> stack = new Stack<>();
        for (T t : arr) {
            stack.push(t);
        }
        for (int i = 0; i < arr.size(); i++) {
            arr.set(i, stack.pop());
        }
    }
}