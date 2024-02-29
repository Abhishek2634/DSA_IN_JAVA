package LinkedList;

public class Creation{
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

    public void addFirst(int data){// adding first to linkList takes O(1) time;
        //Step 1 : create new node
        Node newNode =  new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        //Step 2 : newNode next = head;
        newNode.next = head;

        //step 3 ;
        head = newNode;
    }
    public void addLast(int data){ // adding last to linkList takes O(1) time;
        //create new node;
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }

        //step 2 
        tail.next = newNode;
        tail = newNode;

    }
    public void add(int idx ,int data){
        if(idx == 0){
            addFirst(data);
            return;
        }
        Node newNode = new Node (data);
        size++;
        Node temp = head;
        int i = 0;
        while(i < idx - 1){
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }
    int removeFirst(){
        if(size == 0){
            return Integer.MIN_VALUE;
        }else if(size == 1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val; 
    }
    public void print(){// O(N) time
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+"-->");
            temp = temp.next;

        }
        System.out.print("null");
        System.out.println();
    }
    public int removeLast(){
        Node prev = head;
        if(size == 0){
            System.out.println("ll is empty");
            return Integer.MIN_VALUE;
        }else if (size == 1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        for(int i = 0; i < size - 2;i++){
            prev = prev.next;
        }
        int val = prev.next.data;
        prev.next = null;
        tail = prev;
        return val;

    }
    public void search(int n){
        Node tmp = head;
        int i  = 0;
        while(tmp != null){
            if(n == tmp.data){
                System.out.println(i);
                return;
            }
            tmp = tmp.next;
            i++;
        }
        System.out.println(-1);

    }
    public int helper(Node head,int key){
        if(head == null){
            return -1;
        }
        if(head.data == key){
            return 0;
        }

        int idx = helper(head.next,key);
        if(idx == -1){
            return -1;
        }
        return idx + 1;
    }
    public void recursiveSearch(Node head,int key){
       System.out.println(helper(head,key)); 
    }
    public void printReverse(){
        Node prev = null;
        Node curr =tail=  head;
        Node next ;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next ;
        }
        head = prev;
    }
    public void RemoveNodeFromEnd(int n){
        Node tmp = head;
        int siz = 0;
        while(tmp != null){
            siz++;
            tmp =tmp.next;
        }
        if(siz == n){
            head = head.next;
        }
        int i = 1;
        Node prev = head;
        while(i < siz - n){
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
    }

    public Node findmiddle(Node head){
        Node fast = head;
        Node slow = head;
        while( fast != null && fast.next != null ){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;

    }
    public boolean checkPalindrome(Node head){
        if(head == null || head.next == null) return true;
        Node tmp = head;
        Node middle = findmiddle(head);
        Node prev = null;
        Node curr = middle;
        while(curr != null){
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        while(prev != null){
            if(tmp.data != prev.data){
                return false;
            }
            prev = prev.next;
            tmp = tmp.next;
        }
        return true;
    }

    public void printZigzag(Node head){
        //find mid node ;
        Node fast = head;
        Node slow = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        Node mid = slow;
        Node rightHead = mid.next;
        mid.next = null;
        Node prev = null;
        Node curr = rightHead;
        while(curr != null){
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node Rt = prev;
        Node Lt = head;
        Node nextL,nextR;
        while(Rt != null && Lt != null){
            nextL = Lt.next;
            Lt.next = Rt;
            nextR = Rt.next;
            Rt.next = nextL;
            Rt = nextR;
            Lt = nextL;
        }

    }

    
    
    public static void main(String[] args) {
        Creation ll = new Creation();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        // ll.addLast(5);
        ll.print();
        ll.printZigzag(head);
        ll.print();
        


        
    }
}