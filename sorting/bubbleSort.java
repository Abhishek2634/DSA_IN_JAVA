package sorting;

class bubbleSort {
public static void main(String[] args) {
    int arr [] = {1,2,3,4,5};
    bubble(arr);
}
static void bubble(int arr[]){
    int n = arr.length;
for(int i = 0; i < n-1;i++){
    int swap = 0;
    for(int j = 0;j < n-1-i;j++){
        //swap;
        if(arr[j] > arr[j+1]){
            int temp = arr[j+1];
            arr[j+1] = arr[j];
            arr[j] = temp;
            swap++;
        }
    }
    if(swap == 0){
        System.out.println("arr is already sorted");
        return ;
    }
}
for(int i = 0; i < n;i++){
    System.out.print(arr[i]+" ");
}
}
}




