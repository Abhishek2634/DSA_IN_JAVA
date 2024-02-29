package Queue;
import java.util.Stack;


public class QueueUsingTwoStack {
    static Stack <Integer> s1 = new Stack<>();
    Stack <Integer> s2 = new Stack<>();
    public static boolean empty(){
        return s1.isEmpty();
    }
    public void add(int data){
        while(!s1.isEmpty()){
            s2.push(s1.pop());
        }
        s1.push(data);
        while(!s2.isEmpty()){
            s1.push(s2.pop());
        }
    }
    public int remove(){
        if(s1.isEmpty()){
            System.out.println("stack is empty");
        }
        int num = s1.pop();
        return num;
    }
    public void peek(){
        if(s1.isEmpty()){
            System.out.println("stack is empty");
        }
        System.out.println(s1.peek());
    }
    public static void main(String[] args) {
        QueueUsingTwoStack q = new QueueUsingTwoStack();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        while(!s1.isEmpty()){
            q.peek();
            q.remove();
        }
    }
}
