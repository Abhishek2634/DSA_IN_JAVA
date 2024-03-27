package Leetcode.Streak;
public class SubarrayProductLessThanK{
  public static void main(String args[]){
    int arr[] = {1,2,3,};
    int k = 7;
    // need to find total no. of subarrays whose product is less than k;
    // 1 method is brute force using nested loops.
    // another is using sliding window. 

    int s = 0; int e = 0; int count = 0; int prod = 1;
    if(k <= 1){
        System.out.println(0);
        return;
    }  
    while(s < arr.length){
      prod *= arr[s++];
      while(prod >= k){
        prod /= arr[e++];
      }
      count += s-e;
    }
    System.out.println(count);
    
  }
}
