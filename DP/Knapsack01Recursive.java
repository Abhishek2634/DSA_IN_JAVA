package DP;

public class Knapsack01Recursive {
    public static int Knapsack(int val[],int wt[],int w,int n){
        if(n == 0 || w == 0) return 0;
        if(wt[n - 1] <= w){ // valid
            //include 
            int ans1 = val[n-1] + Knapsack(val,wt,w-wt[n-1],n-1);
            //exclude
            int ans2 = Knapsack(val,wt,w,n-1);
            return Math.max(ans1,ans2);
        }else{// not valid
            return Knapsack(val,wt,w,n-1);
        }
    }
    public static void main(String[] args) {
        int val[]= {15,14,10,45,30};
        int wt [] = {2,5,1,3,4};
        int w = 7;
        System.out.println(Knapsack(val,wt,w,val.length));
    }
}
