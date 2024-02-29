package sorting;

public class SelectionSort {
    public static void main(String[] args) {
        int arr [] = {5,4,8,2,9,7};
        sort(arr);
    }
    static void sort(int arr[]){
        int  n = arr.length;
        for(int i = 0;i < n-1;i++){
            int min = Integer.MIN_VALUE;
            int min_index = i;
            for(int j = i+1; j < n;j++){
                if(min < arr[j]){
                    min = arr[j];
                    min_index = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min_index];
            arr[min_index] = temp;
        }
        for(int i = 0;i < arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    static void another(int arr[]){
        int  n = arr.length;
        for(int i = 0;i < n-1;i++){
            int minPos = i;
            for(int j = i+1; j < n;j++){
                if(arr[minPos] > arr[j]){
                    minPos = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minPos];
            arr[minPos] = temp;
        }
        for(int i = 0;i < arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
