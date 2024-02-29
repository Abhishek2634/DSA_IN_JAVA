package Greedy;
import java.util.*;

public class ActivitySelection {

    // n activities with start and end time .select max no. of activities that can be performed by a single person. assume that a person can do a single task at a time.
    public static void main(String[] args) {
        //if arr is sorted.
        // int start[] = {1,3,0,5,8,5};
        // int end[] = {2,4,6,7,9,9};
        // sorted(start,end);


        // if arr is not sorted
        int start1 [] = {1,3,0,5,8,5};
        int end1 [] = {2,4,6,7,9,9};
        notSorted( start1, end1);
    }
    
    static void sorted(int start[],int end[]){

        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(0);
        int ans = 1;
         int next = end[0];
         for(int i = 1; i < start.length;i++){
            if(start[i] >= next){
                ans++;
                next = end[i];
                arr.add(i);
            }
        }
    System.out.println(ans);
    for(int i = 0; i < arr.size(); i++){
        System.out.println(arr.get(i));
    }
}
static void notSorted(int start1[],int end1[]){
    ArrayList <Integer> ans = new ArrayList<>();
    int arr[][] = new int[start1.length][3];
    for(int i = 0; i < arr.length;i++){
        arr[i][0] = i;
        arr[i][1] = start1[i];
        arr[i][2] = end1[i];
    }

    Arrays.sort(arr,Comparator.comparingDouble(o -> o[2]));
    int countAct = 0;
    countAct = 1;
    ans.add(0);
    int end = arr[0][2];
    for(int i = 1;i < arr.length;i++){
        if(arr[i][1] >= end){
            countAct++;
            end = arr[i][2];
            ans.add(i);
        }
    }
    System.out.println(countAct);
    for(int i = 0; i < ans.size();i++){
        System.out.println(ans.get(i));
    }
}
}