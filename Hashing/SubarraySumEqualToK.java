import java.util.HashMap;

public class SubarraySumEqualToK {
    public static void main(String[] args) {
        int arr[] = {10,2,-2,-20,10};
        int k = -10;
       // return no. of subarrays of sum equal to k;
       int sum = 0;
       int ans = 0;
        HashMap<Integer,Integer> hs = new HashMap<>();
        hs.put(0,1);
        for(int i = 0; i < arr.length;i++){
            sum += arr[i];
            if(hs.containsKey(sum - k)){
                ans += hs.get(sum - k);
            }
           hs.put(sum,hs.getOrDefault(sum, 0) + 1);
            
        }
        System.out.println(ans);
    }
}
