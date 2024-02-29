package Stack;
import java.util.ArrayList;

public class Arraylist {
    public static class stack{
        ArrayList <Integer>list = new ArrayList<>();
        public boolean isEmpty(){
            if(list.size() == 0) return true;
            return false;
        }
        public void push(int data){
            list.add(data);
        }
        public int peek(){
            if(isEmpty()){
                return -1;
            }
            return list.get(list.size()-1);
        }
        public int pop(){
            if(isEmpty()){
                return -1;
            }
            int val = list.get(list.size()-1);
            list.remove(list.get(list.size()-1));
            return val;
        }
    }
    public static void main(String[] args) {
        stack a = new stack();
        a.push(1);
        a.push(2);
        a.push(3);
        while(!a.isEmpty()){
            System.out.println(a.peek());
            a.pop();
        }
    }
}
