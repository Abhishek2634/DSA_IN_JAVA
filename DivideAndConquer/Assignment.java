package DivideAndConquer;
// import java.util.*;

public class Assignment {
    public static void main(String[] args) {

        //sort strings using mergesort.
        // String arr[] = { "sun", "earth", "mars", "mercury"};
        // mergesort(arr,0,arr.length-1);
        // System.out.println(Arrays.toString(arr));


        //inversion count.
        int  arr[ ] = {2, 4, 1, 3, 5};
        inversion (arr);
    }
    static void mergesort(String arr[],int si,int ei){
        if(si >= ei) return;
        int mid = si + (ei - si)/2;
        mergesort(arr, si, mid);
        mergesort(arr, mid+1, ei);
        merge(arr,si,ei,mid);
    }
    static void merge(String arr[],int si,int ei,int mid){
        String tmp[] = new String[ei - si +1];
        int i = si;// iterator for left half
        int j = mid+1;
        int k = 0; // arr iterator

        while(i <= mid && j <= ei){
            if(arr[i].compareTo(arr[j]) >= 0){
                tmp[k++] = arr[i++];
            }
            else{
                tmp[k++] = arr[j++];
            }
        }

        while(i <= mid){
            tmp[k++] = arr[i++];
        }
        while(j <= ei){
            tmp[k++] = arr[j++];
        }
        //copy 

        for(i = si,k = 0;k < tmp.length;k++,i++){
            arr[i] = tmp[k];
        }

    }
    static int merge(int[] arr,int si, int ei,int mid){
        int inversion = 0;
        int i = si;
        int j = mid;
        int k = 0;
        int tmp[] = new int[ei - si + 1];
        while(i < mid && j <= ei){
            if(arr[i] < arr[j]){
                tmp[k++] = arr[i++];
            }else{
                tmp[k++] = arr[j++];
                inversion+= mid-i;
            } 
        }
        while (i < mid) {
            tmp[k++] = arr[i++];
        }
        while (j <= ei) {
            tmp[k++] = arr[j++];
        }
        //copy an array;

        for(i = si,k = 0; i <= ei;i++,k++){
            arr[i] = tmp[k];
        }
        return inversion;
    }
    static int count(int arr[],int si,int ei){
        int inversion = 0;
        if(si < ei ){
        int mid = si + (ei - si)/2;
        inversion = count(arr,si,mid);
        inversion += count(arr,mid+1,ei);
        inversion += merge(arr,si,ei,mid+1);
        }
        return inversion;
    }
    static void inversion (int []arr){
        System.out.println("total inversion are :"+ count(arr,0,arr.length-1));
    }

}