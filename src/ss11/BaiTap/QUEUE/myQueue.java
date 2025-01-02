package ss11.BaiTap.QUEUE;

public class myQueue<T> {

    private Node<T> front;
    private Node<T> rear;



    public myQueue(){
        this.front = null;
        this.rear = null;
    }

    public Node<T> dequeue(){
        if (this.front == null){
            return null;
        }
        Node<T> temp = this.front;

        this.front = this.front.link;
        if (this.front == null)
            this.rear = null;
        return temp;
    }

    public void enqueue(T key) {
        Node<T> temp = new  Node<T>(key);
        if (this.rear == null) {
            this.front = this.rear = temp;
            return;
        }
        this.rear.link = temp;
        this.rear = temp;
    }
}
