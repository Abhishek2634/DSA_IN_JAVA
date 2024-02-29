package LinkedList;

public class OddEvenLinkedList {
    public static class Node{
        int data;
        Node next;

        public Node (int data){
            this.data = data;
            this.next = null;
        }

    }
    public static Node head;
    public static Node tail;
    public static int size;

    public static void main(String[] args) {
        head = new Node(8);
        head.next = new Node(12);
        head.next.next = new Node(10);
        head.next.next.next = new Node(5);
        head.next.next.next.next = new Node(4);
        head.next.next.next.next.next  = new Node(1);
        head.next.next.next.next.next.next = new Node(6);



    }
}
