package Greedy;
import java.util.*;
public class MaxLengthChainOfPairs {
    public static void main(String[] args) {
        //you are given n pair of nos. In every pair the first no is smaller then the second no.A pair (c,d) comes after (a,b). if (b < c);
        // find the longest chain  which can be formed from a given set of pairs.
        int arr[][] = {{5,24},{39,60},{5,28},{27,40},{50,90}};
        sol(arr);
    }
    static void sol(int arr[][]){
        Arrays.sort(arr,Comparator.comparingDouble(e -> e[1])); // t.c -- O(n log n)
        int ans = 0;
        ans = 1;
        int end = arr[0][1];
        for(int i = 1; i < arr.length;i++){
            if(arr[i][0] >= end){
                ans++;
                end = arr[i][1];
            }
        }
        System.out.println("max length of chain is : " + ans);
    }

}
