package Algorithms;
import java.util.*;

public class DutchAlgo {
    public static void main(String[] args) {
        int arr[] = {0,2,2,1,1,2};
        int end = arr.length-1;
        int start = 0;
        int mid = 0;
        while(mid <= end){
            switch(arr[mid]){
                case 0 : 
                    swap(arr,start,mid);
                    start ++;
                    mid ++;
                    break;
                case 1 :
                    mid ++ ;
                    break;
                case 2 :
                    swap(arr,mid,end);
                    end--;
                    break;   
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void swap(int arr[],int s, int e){
        int tmp = arr[s];
        arr[s] = arr[e];
        arr[e] = tmp;
    }
}
