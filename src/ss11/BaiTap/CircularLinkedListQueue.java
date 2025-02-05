package ss11.BaiTap;

public class CircularLinkedListQueue<T> {
    Node front;
    Node rear;
    private static class Node<E> {
        E data;
        Node link;

        public Node(E data) {
            this.data = data;
            this.link = null;
        }
    }

    public CircularLinkedListQueue() {
        this.front = null;
        this.rear = null;
    }

    public CircularLinkedListQueue(T data) {
        this.front = new Node(data);
        this.rear = this.front;
        this.rear.link = this.front;
    }

    public void enqueue(T data) {
        Node temp = new Node(data);
        if (this.rear == null) {
            this.front = this.rear = temp;
            this.rear.link = this.front;
            return;
        }
        this.rear.link = temp;
        this.rear = temp;
        this.rear.link = front;
    }
    public Node dequeue() {
        if (this.front == null)
            return null;
        Node temp = this.front;
        if (this.front == this.rear){
            this.front = this.rear = null;
        } else {
            this.front = this.front.link;
            this.rear.link = this.front;
        }

        return temp;
    }

    public static void main(String[] args) {
        CircularLinkedListQueue queue = new CircularLinkedListQueue();
        queue.enqueue(10);
        queue.enqueue(20);
//        queue.dequeue();
//
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);
        queue.dequeue();
        queue.dequeue();

        System.out.printf(queue.rear.link.data.toString());
        System.out.printf(queue.rear.data.toString());

//        System.out.println("Dequeued item is " + queue.dequeue().key);
    }
}
