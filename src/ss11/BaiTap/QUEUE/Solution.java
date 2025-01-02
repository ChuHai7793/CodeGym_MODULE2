package ss11.BaiTap.QUEUE;
import  ss11.BaiTap.QUEUE.Node;

import java.util.Queue;

public class Solution {
    public static void main(String[] args){

        myQueue<Character> q = new myQueue<>();
        q.enqueue('a');
        q.enqueue('b');
        q.dequeue();

        System.out.println(q.dequeue().data);
    }
}
