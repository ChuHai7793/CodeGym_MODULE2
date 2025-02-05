package ss10.BaiTap;

public class MyLinkedList<E> {
    private  Node head;
    private  int numNodes;

    public MyLinkedList(E data) {
        head = new Node(data);
        numNodes++;
    }

    private class Node {
        private Node next;
        private Object data;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return this.data;
        }
    }

    public void add(int index, E data) {
        Node temp = head;
        Node holder;

        for(int i=0; i < index-1 && temp.next != null; i++) {
            temp = temp.next;
        }
        holder = temp.next;
        temp.next = new Node(data);
        temp.next.next = holder;
        numNodes++;
    }

    public void addFirst(E data) {
        Node temp = head;
        head = new Node(data);
        head.next = temp;
        numNodes++;
    }

    public void addLast(E data){
        Node temp = head;
        for(int i=0; i < numNodes; i++) {
            if ( temp.next == null){
                temp.next = new Node(data);
                break;
            }
            temp = temp.next;
        }
        numNodes++;
    }
    public E removeFirst(){
        Node removedElement = head;
        head = head.next;
        numNodes--;
        return (E) removedElement.data;
    }
    public E remove(int index){
        if (index==0){
            return removeFirst();
        }

        Node previousNode = head;
        for (int i =1;i<index;i++){
            previousNode = previousNode.next;
        }
        Node removedNode =  previousNode.next;
        previousNode.next = removedNode.next;
        numNodes--;

        return (E) removedNode;
    }




    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public int size(){
        return this.numNodes;
    }
    public void printList() {
        Node temp = head;
        while(temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}
