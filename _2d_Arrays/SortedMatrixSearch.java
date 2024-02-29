package _2d_Arrays;


public class SortedMatrixSearch {
    static void ans(int arr[][],int key){
        //t.c - O(n+m);
        int row = 0;
        int col = arr[0].length-1;
        while(row <= arr.length-1 && col >= 0){
            if(arr[row][col] == key){
                System.out.println("key is found at index :"+"("+row+","+col+")");
                return;
            }
            else if (arr[row][col] > key){
                col--;
            }
            else{
                row++;
            }
        }
        System.out.println("key is not present in the array");
    }

    static void another (int arr[][],int key){
        int row = arr.length-1;
        int col = 0;
        while(row >= 0 && col <= arr.length-1){
            if(arr[row][col] == key){
                System.out.println("key is found at index :("+row+","+col+")");
                return;
            }
            else if (arr[row][col] > key){
                row--;
            }
            else {
                col++;
            }
        }
        System.out.println("key is not present");
    }

    static void binarySearch(int arr[][], int key){
        for(int i = 0; i < arr.length;i++){
            int left = 0;
            int right = arr[0].length-1;
            while(right >= left){
                int mid = (left + right)/2;
                if(arr[i][mid] == key){
                    System.out.println( "key is found at index :("+i+","+mid+")");
                    return;
                }
                else if (arr[i][mid] > key){
                    right = mid - 1;
                }
                else {
                    left = mid+1;
                }
            }
        }
        System.out.println("key not found");
    }
    public static void main(String[] args) {
        int arr[][] = {{10,20,30,40},{15,25,35,45},{27,29,37,48},{32,33,39,50}};
        int key = 50;
        binarySearch(arr,key);
    }
}
