package ss10.BaiTap;

public class MyLinkedListTest {
    public static void main(String[] args) {
        System.out.println("/=/=/=/= TESTING /=/=/=/=");
        MyLinkedList ll = new MyLinkedList(10);
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);
        ll.add(4,5);
        ll.add(4,4);

//        ll.addLast(10);
        ll.remove(5);
        ll.printList();
    }
}
