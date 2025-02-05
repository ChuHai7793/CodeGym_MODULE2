package ss11.BaiTap;

import java.util.Stack;

public class DecimalToBinaryConverter {

    public static Stack<Integer> convertDecimalToBinary(int decimal) {
        Stack<Integer> stack = new Stack<>();
        int tmp;

         do {
            tmp = decimal % 2;
            decimal = decimal / 2;
            stack.push(tmp);
         } while(decimal > 0);

        return stack;
    }

    public static void main(String[] args) {
        Stack<Integer> stack = convertDecimalToBinary(11);

        while(!stack.isEmpty()) {
            System.out.print(stack.pop());
        }
    }
}
