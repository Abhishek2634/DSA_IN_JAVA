package Leetcode.Contest;

public class CountAlternatingSubarrays {
    public static void main(String[] args) {
        int arr [] = {0,1,1,1};
        int s = 0; int e = 1;
        int ans = 1;
        for(int i = 1; i < arr.length;i++){
            if(arr[i] == arr[i - 1]){
                s = i;
            }
            ans += e - s + 1;
            e++;
        }
        System.out.println(ans);
    }
}
