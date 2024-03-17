import java.util.*;
public class LargestSubarrayWithSum0 {
    public static void main(String[] args) {
        int arr[] = {15,2,-2,-8,1,7,10};
        System.out.println(ans(arr));
    }
    public static int ans(int arr[]){
        int len = 0;
        int sum = 0;
        HashMap<Integer,Integer> hash = new HashMap<>();
        for(int i = 0; i < arr.length;i++){
            sum += arr[i];
            if(!hash.containsKey(sum)){
                hash.put(sum,i);
            }else{
                len = Math.max(len,i - hash.get(sum));
            }
        }
        return len;
    }
}
