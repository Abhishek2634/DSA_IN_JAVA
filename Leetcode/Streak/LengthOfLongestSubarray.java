
public class LengthOfLongestSubarray {
    public static void main(String[] args) {
        // we need to find the length of longest subarray with at most k freq.
        int nums[] = {1,2,3,1,2,3,1,2};
        int k = 2;

        // we can solve it by using hashmap easily. but we use freq array here to take it less time 

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < nums.length;i++){
            max = Math.max(max,nums[i]);
            min = Math.min(min,nums[i]);
        }
        int arr[] = new int [max - min + 1];

        int ans = 0;
        int left = 0;

        for(int i = 0; i < nums.length;i++){
            arr[nums[i] - min]++;
            while(arr[nums[i] - min] > k){
                arr[nums[left] - min] --;
                left ++;
            }
            ans = Math.max(ans,i - left + 1);
        }
        System.out.println(ans);
    }
}
