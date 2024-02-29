package Recursion;

public class SortedArray {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        System.out.println(sorted(arr,0));
    }
    static boolean sorted(int arr[],int i){
        // t.c and s.c are O(N);
        if(i == arr.length-1){
            return true;
        }
        if(arr[i] > arr[i+1]) return false;

        return sorted(arr, i+1);
    }
}
