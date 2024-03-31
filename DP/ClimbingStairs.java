package DP;

public class ClimbingStairs {
    public static void main(String[] args) {
        // count ways to get to the nth stair . the person can climb 1 stair or 2 stair at a time.
        int n = 5;
        System.out.println(recursion(n));
        int dp[] = new int[n+1];
        System.out.println(memoization(n,dp));

        System.out.println(Tabulation(n));
    }
    public static int Tabulation(int n){
        int dp [] = new int[n + 1];
        dp[0] = 1;
        for(int i = 1; i < dp.length;i++){
            if(i == 1){
                dp[i] = dp[i-1] + 0;
            }else{
                if(i - 1 >= 0) {
                    if(i - 3 >= 0){
                        dp[i] = dp[i - 1] + dp[i - 3];
                    }else{
                        dp[i] = dp[i - 1] + 0;
                    }
                }else{
                    dp[i] = 0;
                }
            }
        }
        return dp[n];
    }
    public static int memoization(int n, int dp[]){ // O(n)
        if(n < 0) return 0;
        if(n == 0) return 1;
        if(dp[n] != 0) return dp[n];
        return dp[n] = memoization(n - 1, dp) + memoization(n - 2, dp);
    }
    public static int recursion(int n){// O(2^n);
        if(n < 0) return 0;
        if(n == 0) return 1;
        return recursion(n - 1) + recursion(n - 2) + recursion(n - 3); //choice of 1 step , 2 and 3 steps.
    }
}

