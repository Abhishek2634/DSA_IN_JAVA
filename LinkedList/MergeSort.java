package LinkedList;
class MergeSort{
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

    public void addFirst(int data){// adding first to linkList takes O(1) time;
        //Step 1 : create new node
        Node newNode =  new Node(data);
        if(head == null){
            head = tail = newNode;
            return;
        }
        //Step 2 : newNode next = head;
        newNode.next = head;

        //step 3 ;
        head = newNode;
    }
    public static void print(){// O(N) time
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+"-->");
            temp = temp.next;

        }
        System.out.print("null");
        System.out.println();
    }

    public Node Merge(Node head1 , Node head2){
        Node mergeLL = new Node(-1);
        Node tmp = mergeLL;
        while(head1 != null && head2 != null){
            if(head1.data <= head2.data){
                tmp.next = head1;
                head1 = head1.next;
                tmp = tmp.next;
            }else{
                tmp.next = head2;
                head2 = head2.next;
                tmp = tmp.next;
            }
        }
        while(head1 != null){
            tmp.next = head1;
            head1 = head1.next;
            tmp = tmp.next;
        }
        while (head2 != null) {
            tmp.next = head2;
            head2 = head2.next;
            tmp = tmp.next;
        }
        return mergeLL.next;
    }

    public Node getMid(Node head){
        Node fast = head.next;
        Node slow = head;

        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow; // mid Node ;
    }
    public Node MergeSsort(Node head){
        if(head == null || head.next == null){
            return head;
        }
        //find Mid 
        Node mid = getMid(head);
        //Left and right mergeSort;
        Node rightHead = mid.next;
        mid.next = null;
        Node newleft = MergeSsort(head);
        Node newRight = MergeSsort(rightHead);
       return  Merge(newleft, newRight);
    }
    public static void main(String[] args) {
        MergeSort ms = new MergeSort();
        ms.addFirst(78);
        ms.addFirst(95);
        ms.addFirst(12);
        ms.addFirst(45);
        print();
        MergeSort.head = ms.MergeSsort(MergeSort.head);
        print();
   }
}