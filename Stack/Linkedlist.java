package Stack;

public class Linkedlist {
    public static  class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    static Node head;
    public static class Stack{
        public static boolean is_Empty(){
            if(head == null){
                return true;
            }
            return false;
        }
        public static void push(int data){
            Node newNode = new Node(data);
            if(is_Empty()){
                head = newNode;
                return ;
            }
            newNode.next = head;
            head = newNode;
            
        }
        public static int peek(){
            if(is_Empty()){
                return -1;
            }
            return head.data;
        }
        public static int pop(){
            if(is_Empty()){
                return -1;
            }
            int val = head.data;
            head = head.next;
            return val;
        }
    }
    public static void main(String[] args) {
        Stack.push(1);
        Stack.push(2);
        Stack.push(3);
        while(!Stack.is_Empty()){
            System.out.println(Stack.peek());
            Stack.pop();
        }
    }
}
