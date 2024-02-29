package LinkedList;

public class DoublyLinkedList {
    public static class Node{
        Node next;
        int data;
        Node prev;

        Node(int data){
            this.data = data;
            this. next = null;
            this.prev = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;
    public void  addFirst(int data){
        Node newNode = new Node (data);
        if(head == null) {
            head = tail = newNode;
            size++;
            return;
        }
        newNode.next = head;
        head = newNode;
        head.prev = null;
    }
    public void print(Node head){
        if(head == null){
            System.out.println("nothing to print");
        }
        Node tmp = head;
        while(tmp != null){
            System.out.print(tmp.data+"<-->");
            tmp = tmp.next;
        }
        System.out.println("null");
    }
    public void removeFirst(){
        if(head == null){
            System.out.println("nothing to remove");
            return;
        }
        size--;
        head = head.next;
        head.prev = null;
    }
    public void removeLast(){
        if(head == null){
            System.out.println("nothing to rmv");
            return;
        }
        if(head.next == null){
            head = tail = null;
            return;
        }
        Node tmp = head;
        Node prev = null;
        while(tmp.next != null){
            prev = tmp;
            tmp = tmp.next;
        }
        prev.next = null;
        tail = prev;
        
    }
    public void addLast(){
        Node newNode = new Node(5);
        if(head == null){
            head = tail = newNode;
            return ;
        }
        Node tmp = head;
        while(tmp.next != null){
            tmp = tmp.next;
        }
        tmp.next = newNode;
        newNode.prev = tail;
        tail = newNode;
        // newNode.next = null;
    }
    public void reverse(){
        Node prev = null;
        Node tmp = head;
        while (tmp != null) {
            Node next = tmp.next;
            tmp.next = prev;
            tmp.prev = next;
            prev = tmp;
            tmp = next;
        }
        head = prev;
    }
    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.addFirst(3);
        dll.addFirst(2);
        dll.addFirst(1);
        dll.print(head);
        // dll.removeLast();
        dll.print(head);
        dll.addLast();
        dll.print(head);
        // dll.reverse();
        // dll.print(head);

        
    }
}
