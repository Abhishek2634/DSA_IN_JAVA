package LinkedList;

public class DeleteMnodeAfterNnode {
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
         head = new Node(1);
         head.next = new Node(2);
         head.next.next = new Node(3);
         head.next.next.next = new Node(4);
         head.next.next.next.next = new Node(5);
         head.next.next.next.next.next = new Node(6);
         head.next.next.next.next.next.next = new Node(7);
         head.next.next.next.next.next.next.next = new Node(8);
         head.next.next.next.next.next.next.next.next = new Node(9);
         head.next.next.next.next.next.next.next.next.next = new Node(10);
         
         Node tmp = head;
         Node t = head;
         int n = 2;
         int m = 3;
         while(tmp != null){
            for(int i = 0; i < n-1 && tmp != null;i++){
                tmp = tmp.next;
            }
            if(tmp == null){
                return;
            }
             t = tmp.next;
            for(int j = 1;j <= m && t != null;j++){
                 t = t.next;
            }
            tmp.next = t;
            tmp = t;
         }
         while(head != null){
            System.out.print(head.data+" ");
            head = head.next;
         }

         

    }
}
