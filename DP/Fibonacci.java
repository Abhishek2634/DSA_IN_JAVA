package DP;

public class Fibonacci {
    public static void main(String[] args) {
        int n = 5;
        // tell me fifth fibonacci no.
        // using recursion;

        System.out.println(recursive (n));
        int dp[] = new int[n+1];
        System.out.println(Dp(n,dp));
    }
    public static int Dp (int n, int dp[]){ // t.c - 0(n);
        if(n == 0 || n == 1) return n;
        if(dp[n] != 0) return dp[n];
        dp[n] = Dp(n-1,dp) + Dp(n-2,dp); 
        return dp[n];
    }
    
    public static int recursive(int n){ // t.c - O(n^2);
        if(n == 0 || n == 1) return n;
        int ans = recursive(n-1) + recursive(n-2);
        return ans;
    }
}
