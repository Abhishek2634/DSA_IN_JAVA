package LinkedList;

public class Detecting_Cycle {
    static class Node {
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    static Node head;
    static Node tail;

    public static boolean isCycle(){
        Node fast = head;
        Node slow = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(slow.data == fast.data){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Detecting_Cycle.head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = head;

        System.out.println(isCycle());
    }
}
