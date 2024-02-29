package DivideAndConquer;

public class SortedRotatedArray {
    public static void main(String[] args) {
        int arr[] = {4,5,6,7,0,1,2};
        int key = 1;
        int ans = search(arr,0,arr.length-1,key);
        System.out.println(ans);
    }
    static int search(int arr[],int si,int ei,int key){
        if(si > ei) return -1;
        int mid = si+(ei - si)/2;
        if(arr[mid] == key){
            return mid;
        }
        //mid on line 1
        if(arr[mid] >= arr[si] ){
            //left .
            if(key >= arr[si] && key <= arr[mid]){
               return search(arr, si, mid-1, key);
            }
            //right
            else{
                return search(arr,mid+1,ei,key);
            }

        }
        //mid on line 2;
        else{
            //right
            if(key  >= arr[mid] && key <= arr[ei]){
               return search(arr, mid+1,ei, key);
            }
            else{
               return search(arr, si, mid-1, key);
            }
        }
    }
}
