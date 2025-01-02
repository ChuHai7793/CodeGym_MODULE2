package ss11.BaiTap.QUEUE;

public class Node<T> {
    public T data;
    public Node<T> link;

    public Node(){

    }
    public Node(T data) {
        this.data = data;
        this.link = null;
    }
}
