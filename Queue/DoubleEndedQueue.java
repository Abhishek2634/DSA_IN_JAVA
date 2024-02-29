package Queue;

import java.util.Deque;
import java.util.LinkedList;

public class DoubleEndedQueue {
    public static void main(String[] args) {
        //double ended queue.
        Deque<Integer> de = new LinkedList<>();
        de.addFirst(1);
        de.addFirst(2);
        de.addFirst(3);
        de.addLast(5);
        de.removeLast();
        de.removeFirst();
        de.addFirst(10);
        System.out.println(de);
        System.out.println("first element is :" + de.getFirst());
        System.out.println("last element is :" + de.getLast());
    }
}
