package BackTracking;

public class example {
    public static void main(String[] args) {
        int arr[] = new int [5];
        backtrack(arr, 0, 1);
        printArr(arr);
    }
    public static void backtrack(int arr[],int i,int val){
        //base
        if(i == arr.length){
            printArr(arr);
            System.out.println();
            return ;
        }

        arr[i] = val;
        backtrack(arr, i+1, val+1);
        arr[i] = arr[i] - 2;
    }
    public static void printArr(int arr[]){
        for(int i = 0 ; i < arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
    }
}
