package DP;

public class Fibonacci {
    public static void main(String[] args) {
        int n = 5;
        // tell me fifth fibonacci no.
        // using recursion;

        System.out.println(recursive (n));
        int dp[] = new int[n+1];
        System.out.println(Dp(n,dp));
        System.out.println(Tabulation(n));
    }
    public static int Dp (int n, int dp[]){ // t.c - 0(n);
        if(n == 0 || n == 1) return n;
        if(dp[n] != 0) return dp[n];
        dp[n] = Dp(n-1,dp) + Dp(n-2,dp);  // memoization in dp -> make use of dp array along with recursion.
        return dp[n];
    }

    public static int recursive(int n){ // t.c - O(n^2);
        if(n == 0 || n == 1) return n;
        int ans = recursive(n-1) + recursive(n-2);
        return ans;
    }
    public static int Tabulation(int n){
        int Dp[] = new int[n+1];
        Dp[0] = 0;
        Dp[1] = 1;
        for(int i = 2; i < Dp.length;i++){
            Dp[i] = Dp[i-1] + Dp[i-2];
        }
        return Dp[n];
    }
}
