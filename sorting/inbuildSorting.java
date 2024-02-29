package sorting;
import java.util.Arrays;
import java.util.Collections;

public class inbuildSorting {
    public static void main(String[] args) {
        Integer arr[] = {3,6,4,9,4};
        // ascending(arr);
        descending(arr);
    }
    static void ascending(int arr[]){
        Arrays.sort(arr,0,4);
        for(int i = 0; i < arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    static void descending(Integer arr[]){
        Arrays.sort(arr,0,3,Collections.reverseOrder());
        for(int i = 0; i < arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
