public class SubarrayCount{
    public static void main(String[] args) {
        int nums[] = {1,3,2,3,3};
        int k = 2;
        int max=Integer.MIN_VALUE;
        long ans=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
            }
        }
        int l=0,r = 0,n = nums.length;
        while(r < n){
            if(nums[r] == max){
                k--;
            }
                while(k == 0){
                    ans += nums.length-r;
                    if(nums[l] == max) k++;
                    l++;
                }
            
            r++;
        }
        System.out.println(ans);
    }
}