package Greedy;
public class KthLargestOddNoInAGivenRange{
    public static void main(String[] args) {
        //We have two variables L and R,indicating a range of integers from L to R inclusive,and a number K ,the task is to find Kth largest odd number. If K > number of odd numbers in the range L to R then return 0.

        int L = -3;
        int R = 3;
        int k = 4;
        // brute(L,R,k);
        System.out.println(optimised(L,R,k));
    }
    public static int optimised(int L,int R,int k){
        if((R & 1) > 0){
            int count = (int) Math.ceil((double)(R-L+1)/2);
            if (k > count) return 0;
            else{
                return R - 2*k + 2;
            }
        }else{
            int count = (R - L + 1)/2;
            if(count < k){
                return 0;
            }else{
                return R - 2*k + 1;
            }
        }
    }
    public static void brute (int L,int R,int k){
        for(int i = R; i >= L;i--){
            if(i % 2 != 0){
                k--;
                if(k == 0){
                    System.out.println(i);
                    return;
                }
            }
        }
        System.out.println(0);
    }
}