import java.util.*;
public class MajorityElement {
    public static void main(String[] args) {
        // given an integer array nums of size n , find all the elements that appear more than n/3 times.
        int nums[] = {1,3,2,5,1,3,1,5,1};
        int n = nums.length;
        HashMap<Integer,Integer> hs = new HashMap<>();
        for(int i = 0;i < n;i++){
            hs.put(nums[i],hs.getOrDefault(nums[i],0)+1);
        }
        for(int m : hs.keySet()){
            if(hs.get(m) > n/3){
                System.out.println(m);
            }
        }
    }
}
