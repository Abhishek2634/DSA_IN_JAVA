package Arrays;

public class binarySearch {
    public static void main(String[] args) {
        int arr[] = {12,16,44,32,63,87};
        int key = 16;
        search(arr,key);
    }
    static void search(int arr[],int key){
        int start = 0;
        int end = arr.length-1;
        while (end >= start) {
            int mid = (start + end)/2;
            if(arr[mid] == key){
                System.out.println("key is at index :"+ mid);
                return;
            }
            else if(arr[mid] > key)
            {
                end = mid-1;
            }
            else {
                start = mid+1;
            }
        }
             System.out.println("key not found");
        
    }
}
