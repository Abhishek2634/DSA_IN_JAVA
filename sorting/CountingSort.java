package sorting;

public class CountingSort {
    public static void main(String[] args) {
        int arr[] = {3,3,2,6,4,7,1,9,12,8};
        counting(arr);

    }
    static void counting(int arr[]){
        int sum = 0;
        for(int i = 0;i < arr.length ;i++)
        {
            sum = Math.max(sum,arr[i]);
        }
        int freq[] = new int [sum+1];
        for(int i = 0; i < arr.length;i++)
        {
            freq[arr[i]]++;
        }
        int j = 0;
        for(int i = 0; i < freq.length;i++)
        {
            while(freq[i] > 0)
            {
                arr[j] = i;
                j++;
                freq[i]--;
            }
        }
        for(int i = 0; i < arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    
}
