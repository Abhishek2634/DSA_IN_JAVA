package sorting;
public class assignment {
    public static void main(String args[]) {
        int arr[] = {3,6,2,1,8,7,4,5,3,1};
        int n = arr.length;
        // bubble(arr,n);
        // selection(arr,n);
        insertion(arr,n);
        counting(arr, n);

    }
    static void bubble(int arr[],int n){
        for(int i = 0; i < n-1;i++){
            for(int j = 0;j < n-1-i ;j++){
                if(arr[j] < arr[j+1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for(int i = 0; i < n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    static void selection(int arr[],int n){
        for(int i = 0; i < n-1;i++){
            int index = i;
            for(int j = i+1;j < n;j++){
                if(arr[index] < arr[j]){
                    index = j;
                }
            }
            //swap 
            int temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }
        for(int i = 0;i < arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    static void insertion(int arr[], int n){
        for(int i = 1;i < n;i++){
            int curr = arr[i];
            int prev = i-1;
            //selecting right place to fit a no.
            while(prev >= 0 && arr[prev] < curr){
                arr[prev+1] = arr[prev];
                prev--;
            }
            //insertion
            arr[prev+1] = curr;
        }
        for(int i = 0; i < n;i++){
         System.out.print(arr[i]+" ");
        }
    }
    static void counting(int arr[],int n){
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < n;i++){
            max = Math.max(arr[i],max);
        }

        int freq [] = new int [max+1];
        for(int i = 0;i < n;i++){
            freq[arr[i]]++;
        }

        for(int i = freq.length-1; i >= 0;i--){
            while(freq[i] > 0){
                System.out.print(i+" ");
                freq[i]--;
            }
        }
    }
}
