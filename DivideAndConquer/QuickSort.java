package DivideAndConquer;

public class QuickSort {
    static void printArr(int arr[]){
        for(int i = 0; i < arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static int partition(int arr[],int si, int ei){
        
        int pivot = arr[ei];
        int i = si-1;
        for(int j = si; j < ei; j ++){
            if(arr[j] <= pivot){
                i++;
                //swap;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp ;
            }
        }
        i++;
        //swap.
        int temp = pivot;
        arr[ei] = arr[i];
        arr[i] = temp;
        return i;
    }
    public static void quickSort(int arr[],int si,int ei){
        if(si >= ei) return;
        // last element
        int partitionIdx = partition(arr,si,ei);
        quickSort(arr, si, partitionIdx-1);  //left 
        quickSort(arr, partitionIdx+1, ei);  // right;

        
    }
    public static void main(String[] args) {
        int arr [] = {3,5,1,1,2}  ;                  //{6,3,9,8,2,5};
        quickSort(arr,0,arr.length-1);
        printArr(arr);
    }
}
