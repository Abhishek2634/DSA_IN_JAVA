package Stack;

import java.util.Stack;

public class PalindromeLinkedList {
    static class Node {
        Node next;
        char data;
        Node(char data){
            this.data = data;
            this.next = null;
        }
    }
    static Node head;
    static Node tail;
    public static void main(String[] args) {
        Node head = new Node('a');
        Node newNode = new Node('b');
        head.next = newNode;
        head.next.next = new Node('c');
        head.next.next.next = new Node ('a');


       System.out.println(check(head));
    }

    static boolean check(Node head){
        Stack <Character> a = new Stack<>();
        Node tmp = head;
        while(tmp != null){
            a.push(tmp.data);
            tmp = tmp.next;
        }

        while(head != null){
            char b = a.pop();
            if(head.data != b){
                return false;
            }
            head = head.next;
        }
        return true;
    }
    
}
