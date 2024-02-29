package Arrays;

public class pushZerosToEnd {
    public static void main(String[] args) {
        int arr[] = {1,2,3,0,0,0,5,3,2,4,0,4};
        // int count = 0;
        // for(int i = 0; i < arr.length;i++){
        //     if(arr[i] != 0){
        //         arr[count++] = arr[i];
        //     }
        // }
        
        // while(count < arr.length){
        //     arr[count++] = 0;
        // }
        
        // for(int i = 0; i < arr.length;i++){
        //     System.out.print(arr[i]+" ");
        // }

            //swap code;

            int n = arr.length;
            int j = 0;
            for(int i = 0 ;i < n;i++){
                if(arr[i] != 0){
                   swap(arr,i,j);
                    j++;
                }
            }
            for(int i = 0; i < n;i++){
                System.out.print(arr[i]+" ");
            }

    }
    static void swap(int arr[],int a, int b){
        int temp = arr[b];
        arr[b] = arr[a];
        arr[a] = temp;
    }
}
