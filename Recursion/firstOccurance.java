package Recursion;

public class firstOccurance {
    public static void main(String[] args) {
        int arr []  = {1,2,3,4,7,8,6,5};
        int key = 5;
        int ans = first(arr,key,0);
        if(ans == -1) System.out.println("key does'nt exist");
        else{System.out.println("key exist for the first time at index :"+ans);}
    }
    static int first(int arr[], int key,int i){
        // t.c and s.c are O(N);
        if(arr[i] == key){
            return i;
        }
        if (i == arr.length-1) return -1;
        return first(arr,key,i+1);
    }
}
