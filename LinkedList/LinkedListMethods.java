package LinkedList;
import java.util.LinkedList;

public class LinkedListMethods {
    public static void main(String[] args) {
        LinkedList <Integer> ll = new LinkedList<>();
        ll.addFirst(1);
        ll.addLast(2);
        ll.addFirst(7);
        ll.addFirst(2);
        ll.add(3,10);

        System.out.println(ll);
        ll.removeFirst();
        ll.removeLast();
        System.out.println(ll);
    }
}
