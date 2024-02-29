package Recursion;

public class LastOccurance {
    public static void main(String[] args) {
        int arr[] = {3,4,7,7};
        // int n = arr.length-1;
        int key = 4;
        // System.out.println(index(arr,key,n));
        System.out.println(another(arr,key,0));
    }
    static int index(int arr[],int key,int n){
        //t.c and s.c is O(N);
        if(n < 0) return -1;
        if(arr[n] == key) return n;
        return index(arr, key, n-1);
    }

    static int another(int arr[], int key,int i){
        if(i == arr.length) return -1;

        int isFound = another(arr, key, i+1);
        if(isFound == -1 && arr[i] == key){
            return i;
        }
        return isFound;
    }
}
