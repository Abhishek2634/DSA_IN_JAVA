package Queue;
import java.util.*;
public class GenerateBinaryNos {
    public static void main(String[] args) {
        Queue<String>q = new LinkedList<>();
        String m = "1";
        q.add(m);
        int n = 5;
        for(int i = 0; i < n;i++){
            q.add(q.peek()+"0");
            q.add(q.peek()+"1");
            System.out.println(q.peek());
            q.remove();
        }
    }
}
