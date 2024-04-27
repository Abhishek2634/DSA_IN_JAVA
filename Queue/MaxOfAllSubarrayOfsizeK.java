package Queue;
import java.util.*;
public class MaxOfAllSubarrayOfsizeK {
    public static void main(String[] args) {
        int arr[] = {1,2,3,1,4,5,2,3,6};
        int k = 3;
        int ans [] = new int[arr.length - k + 1];
        int x = 0;
        Deque<Integer> q = new LinkedList<>();
        for(int i = 0; i < arr.length;i++){
            while(!q.isEmpty() && arr[q.peekLast()] <= arr[i]){
                q.pollLast();
            }
            while(!q.isEmpty() && q.peek() < i - k + 1){
                q.poll();
            }
            q.add(i);
            if(k - 1 <= i){
                ans[x++] = arr[q.peek()];
            }
        }
        System.out.println(Arrays.toString(ans));
    }
}
