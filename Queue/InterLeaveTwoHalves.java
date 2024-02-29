package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class InterLeaveTwoHalves {
    static void interLeave(Queue<Integer>q){
        Queue<Integer> Half = new LinkedList<>();
        int size = q.size();
        for(int i = 0; i < size/2;i++){
            Half.add(q.remove());
        }
        while(!Half.isEmpty()){
            q.add(Half.remove());
            q.add(q.remove());
        }
    }
    
    public static void main(String[] args) {
        //only for even length of queue;
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        interLeave(q);

        while(!q.isEmpty()){
            System.out.print(q.peek()+ " ");
            q.remove();
        }
    }
}
