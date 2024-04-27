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
    public static Node check(Node head1){
        Node oddHead = new Node(0);
        Node evenHead = new Node(0);
        Node odd = oddHead;
        Node even = evenHead;

        Node curr = head1;
        while(curr != null){
            if(curr.data % 2 == 0){
                even.next = curr;
                even = even.next;
            }else{
                odd.next = curr;
                odd = odd.next;
            }
            curr = curr.next;
        }
        even.next = oddHead.next;
        odd.next = null;
        return evenHead.next;
    }
    public static void print (Node head1){
        if(head1 == null || head1.next == null){
            System.out.println(head.data);
            return;
        }
        while(head1 != null){
            System.out.println(head1.data);
            head1 = head1.next;
        }
    }
    public static void main(String[] args) {
        head = new Node(8);
        head.next = new Node(12);
        head.next.next = new Node(10);
        head.next.next.next = new Node(5);
        head.next.next.next.next = new Node(4);
        head.next.next.next.next.next  = new Node(1);
        head.next.next.next.next.next.next = new Node(6);

       Node ans =  check(head);
        print (ans);
    }
}
