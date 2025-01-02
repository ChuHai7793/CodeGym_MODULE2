package ss11.BaiTap;

import java.util.LinkedList;

public class Stack {
    public static void main(String[] args){

        LinkedList<Integer> stack = new LinkedList<>();

        int[] arr = {1,2,3,4,5,6};

        for (int i:arr){
            stack.push(i);
        }


        for (int i = 0; i<arr.length; i++){
            arr[i] = stack.pop();
        }


        for (int i:arr){
        System.out.println(i);}
    }
}
