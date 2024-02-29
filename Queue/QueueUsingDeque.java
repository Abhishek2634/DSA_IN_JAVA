package Queue;

import java.util.*;
public class QueueUsingDeque {
    static Deque<Integer>de = new LinkedList<>();
    public static class queue{
        public void add(int data){
            de.addLast(data);
        }
        public void peek(){
            System.out.println(de.getFirst());
        }
        public void remove(){
            de.removeFirst();
        }
    }
    public static void main(String[] args) {
        queue q = new queue();
        q.add(1);
        q.add(2);
        q.add(3);

        while(!de.isEmpty()){
            q.peek();
            q.remove();
        }
    }
}
