package LinkedList;

public class Swap {
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
    public static void main(String[] args) {
        int x = 2;
        int y = 4;
        head = new Node (1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);

        Node headX = head;
        Node headY = head;
        Node prevX = null;
        Node prevY = null;


        while(headX != null && headX.data != x){
            prevX = headX;
            headX = headX.next;
        }
        while(headY != null && headY.data != y){
            prevY = headY;
            headY = headY.next;
        }

        if(headX == null || headY == null) return;
        if(prevX != null){
            prevX.next = headY;
        }else{
            head = headY;
        }

        if(prevY != null){
            prevY.next = headX;
        }else{
            head = headX;
        }
        Node tmp = headX.next;
        headX.next = headY.next;
        headY.next = tmp;

        Node cur = head;
        while(cur != null){
            System.out.print(cur.data+" ");
            cur = cur.next;
        }
    }
}
