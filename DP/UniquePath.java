package DP;
import java.util.*;
public class UniquePath {
    public static int recursion(int dp[][],int i,int j,int m,int n){
        if(i == m-1 && j == n-1){
            return 1;
        }
        int rightPath = 0;
        int downPath = 0;
        
        if(i+1 < m){
            downPath = recursion(dp, i+1, j, m, n);
        }
        if(j+1 < n){
            rightPath = recursion(dp, i, j+1, m, n);
        }

        return rightPath + downPath;
    }
    public static int memo(int dp[][],int i,int j,int m,int n){
        if(i == m-1 && j == n-1){
            return dp[i][j] = 1;
        }
        
        if(dp[i][j] != -1){
            return dp[i][j];
        }

        int rightPath = 0;
        int downPath = 0;

        if(j + 1 < n){
            downPath = memo(dp,i,j+1,m,n);
        }

        if(i + 1 < m){
            rightPath = memo(dp,i+1,j,m,n);
        }

        int totalPath = downPath + rightPath;
        return dp[i][j] = totalPath;
    }
    public static void main(String[] args) {
        //find unique paths to go from 0,0   to   m-1,n-1;
        int m = 7;
        int n = 3;
        int dp [][] = new int[m][n];

        for(int d[] : dp){
            Arrays.fill(d,-1);
        }

    //    System.out.println( recursion(dp,0,0,m,n));
       System.out.println(memo(dp, 0, 0, m, n));
    }
}
