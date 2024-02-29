package Queue;
import java.util.*;

public class StackUsingDeque {
    static Deque<Integer> de = new LinkedList<>();
    public static class stack{
        public void push(int data){
            de.addLast(data);
        }
        public void peek(){
            System.out.println(de.getLast());
        }
        public void pop(){
            de.removeLast();
        }
    }
    public static void main(String[] args) {
        stack s = new stack();
        s.push(1);
        s.push(2);
        s.push(3);

        while(!de.isEmpty()){
            s.peek();
            s.pop();
        }
    }
    
}
