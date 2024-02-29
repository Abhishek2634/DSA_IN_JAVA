package Arrays; 

public class sortedRotatedArray {
    static int  ans (int arr[],int target ){
        int min = pivotIndex(arr);
        if(arr[min] <= target && target <= arr[arr.length-1]){
            return search (arr, min,arr.length-1,target);
        }
        else{
            return  search(arr,0,min-1,target);
        }
    }

    static int search(int arr[], int left,int right,int target){
        while(left <= right){
            int mid = (left +right)/2;
            if(arr[mid]  == target ){
                return mid;
            }
            else if(arr [mid] > target){
                right = mid-1;
            }
            else{
                left = mid+1;
            }
        }
        return -1;
    }
    static int pivotIndex(int arr[]){
        int left = 0;
        int right = arr.length-1;
        while(left < right){
            int mid = (left + right)/2;
            if( mid > 0 && arr[mid] < arr[mid-1]){
                return mid;
            }
            else if(arr[left] <= arr[mid] && arr[mid] > arr[right]) {
                left = mid+1;
            }
            else{
                right = mid-1;
            }
        }
        return left ;
    }
    public static void main(String[] args) {
        int arr[] = {4,5,6,7,1,2,3};
        int target = 3;
        
        int res = ans(arr,target);
        System.out.println(res);
    }
}
