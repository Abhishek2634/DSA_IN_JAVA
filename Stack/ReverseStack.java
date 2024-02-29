package Stack;

import java.util.Stack;

public class ReverseStack {
    static void reverse(Stack<Integer>s){
        if(s.isEmpty()){
            return;
        }
        int top = s.pop();
        reverse(s);
        pushBottom(top,s);
    }
    static void pushBottom(int top,Stack<Integer> s){
        if(s.isEmpty()){
            s.push(top);
            return;
        }
        int p = s.pop();
        pushBottom(top, s);
        s.push(p);
    }
    static void print(Stack<Integer> ans){
        while(!ans.isEmpty()){
            System.out.println(ans.peek());
            ans.pop();
        }
    }
    public static void main(String[] args) {  
        Stack <Integer>s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);

        reverse(s);
        print(s);

    }
}
