package sorting;

public class InsertionSort {
    public static void main(String[] args) { 
        int arr [] = {5,4,1,3,2};
        sort(arr);
    }
    static void sort(int arr[]){
        int n = arr.length;
        for(int i = 1; i < n;i++){
            int curr = arr[i];
            int prev = i-1;
            // finding out the correct position to insert
            while(prev >= 0 && arr[prev] > curr){
                arr[prev+1] = arr[prev];
                prev--;
            }
            // insertion
            arr[prev+1] = curr;
        }
        for(int i = 0 ;i < n ;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
