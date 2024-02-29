package Stack;
import java.util.Stack;
public class PushAtBottom {
    public static void pushBottom (Stack<Integer>s,int n){
        if(s.isEmpty()){
            s.push(n);
            return;
        }
        int top = s.pop();
        pushBottom(s, n);
        s.push(top);

    }
    static void another (Stack<Integer> s, int m){
        Stack<Integer> man = new Stack<>();
        while(!s.isEmpty()){
            man.push(s.pop());
        }

        if(s.isEmpty()){
            s.push(m);
        }
        while(!man.isEmpty()){
            s.push(man.pop());
        }
    }
    public static void main(String[] args) {
        Stack <Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        // pushBottom(s,4);
        another (s,4);
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    }
}
