package Leetcode;
import java.util.*;

public class Streak {
    public static void Q452(int arr[][]){
        Arrays.sort(arr,(a,b) ->Integer.compare(a[0],b[0]));
        int max = arr[0][1];
        int ans = 0;
        for(int i = 1; i < arr.length;i++){
            if(max < arr[i][0]){
                max = arr[i][1];
                ans++;
            }
            max = Math.min(ans,arr[i][1]);
        }
        System.out.println(ans);
    }
    public static void main(String[] args) {
        // int arr[][] = {{10,16},{2,8},{1,6},{7,12}};
        // Q452(arr);

        
    }
}
