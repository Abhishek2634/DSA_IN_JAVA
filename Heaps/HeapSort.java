public class HeapSort {
    public static void heapSort(int arr[]){
       // step 1 build  max- heap (for sorting in ascending order) or min-Heap (for sorting in descending order)
        int n = arr.length;
        for(int i = n/2;i >= 0;i--){
            Heapify(arr,i,n);
        }
       // step 2 push largest at end;
       for(int i = n - 1; i > 0; i--){
        //swap (largest first with last)
        int tmp = arr[0];
        arr[0] = arr[i];
        arr[i] = tmp;
        Heapify(arr,0,i);
       }
    }
    public static void Heapify(int arr[],int i, int size){
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        int maxIdx = i;

        if(left < size && arr[left] > arr[maxIdx]){// change sign for descending order arr[left] < arr[maxIdx]
            maxIdx = left;
        }
        if(right < size && arr[right] > arr[maxIdx]){// change sign for descending order
            maxIdx = right;
        }

        if(maxIdx != i){
            //swap
            int tmp = arr[i];
            arr[i] = arr[maxIdx];
            arr[maxIdx] = tmp;
            Heapify(arr,maxIdx, size);
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,4,5,3};
        heapSort(arr);

        for(int i = 0; i < arr.length;i++){
            System.out.println(arr[i] + " ");
        }
    }
}
