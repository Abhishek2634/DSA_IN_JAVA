package Queue;

public class QueueUsingLinkedlist {
    public static class Node {
        int data ;
        Node next;

        Node (int data){
            this.data = data;
            this.next = null;
        }
    }
    static Node head = null;
    static Node tail = null;
    static  class Queue{
        public boolean isEmpty(){
            return head == null;
        }
        public void add(int data){
            Node newNode = new Node(data);
            if(isEmpty()){
                head = tail = newNode;
                return;
            }
            tail.next = newNode;
            tail = newNode;
        }
        public int remove(){
            if(isEmpty()){
                System.out.println("empty queue");
                return -1;
            }
            int front = head.data;
            head = head.next;
            return front;
        }
        public void peek(){
            if(isEmpty()){
                System.out.println("empty queue");
                return;
            }
            System.out.println(head.data);
        }
    }
    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        while(!q.isEmpty()){
            q.peek();
            q.remove();
        }
    }
}
