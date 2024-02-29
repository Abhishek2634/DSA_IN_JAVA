package Greedy;
import java.util.*;


public class MinAbsoluteDiffPairs {
    public static void main(String[] args) {
        //Given two arrays A and B  of equal length n;pair each element of array A to an element of array b such that the sum S of absolute differences of all the pairs is min.
        int arr1[] = {4,1,8,7};
        int arr2[] = {2,3,6,5};


        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int ans = 0;

        for(int i = 0; i < arr1.length;i++){
            ans += Math.abs(arr1[i] - arr2[i]);

        }
        System.out.println("min abs diff of pairs is : " + ans);



    }
}
