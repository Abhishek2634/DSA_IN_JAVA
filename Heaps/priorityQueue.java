
// import java.util.Comparator;
import java.util.PriorityQueue;
public class priorityQueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();//smallest element comes first.
        // PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());  //reverse the seq.


        pq.add(1);  // add takes O(log n) time 
        pq.add(5);
        pq.add(7);
        pq.add(2);

        while(!pq.isEmpty()){
            System.out.println(pq.peek()); //O(1)
            pq.remove(); // O(log n)
        }
    }
}
